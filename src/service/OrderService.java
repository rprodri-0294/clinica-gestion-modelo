package service;

import model.*;
import java.util.*;

public class OrderService {

    private Set<String> existingOrderIds = new HashSet<>();

    public Order createOrder(String orderId, Patient patient, Employee doctor, List<OrderItem> items) {

        if (orderId == null || orderId.isBlank()) {
            throw new IllegalArgumentException("El ID de la orden no puede ser vacío.");
        }

        if (existingOrderIds.contains(orderId)) {
            throw new IllegalArgumentException("Ya existe una orden con ese ID.");
        }

        if (patient == null) {
            throw new IllegalArgumentException("El paciente no puede ser nulo.");
        }

        if (doctor == null) {
            throw new IllegalArgumentException("El médico no puede ser nulo.");
        }

        if (doctor.getRole() != Role.DOCTOR) {
            throw new IllegalArgumentException("Solo un médico puede generar órdenes.");
        }

        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("La orden debe tener al menos un item.");
        }

        boolean hasDiagnostic = false;
        boolean hasOther = false;

        Set<String> itemNames = new HashSet<>();

        for (OrderItem item : items) {

            if (!itemNames.add(item.getName())) {
                throw new IllegalArgumentException("No se pueden repetir items dentro de la misma orden.");
            }

            if (item instanceof DiagnosticAidOrder) {
                hasDiagnostic = true;
            }

            if (item instanceof MedicationOrder || item instanceof ProcedureOrder) {
                hasOther = true;
            }
        }

        if (hasDiagnostic && hasOther) {
            throw new IllegalArgumentException(
                "No se puede mezclar ayuda diagnóstica con medicamentos o procedimientos."
            );
        }

        existingOrderIds.add(orderId);

        return new Order(orderId, patient, doctor, items);
    }
}
