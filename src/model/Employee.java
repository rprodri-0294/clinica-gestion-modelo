package model;

public class Employee extends Person {

    private Role role;

    public Employee(String name, String id, String email, String phone, String address, Role role) {
        super(name, id, email, phone, address);
        this.role = role;
    }

    public Role getRole() {
        return role;
    }
}
