package model;

public class Patient extends Person {

    private Gender gender;
    private String birthDate;
    private InsurancePolicy insurancePolicy;

    public Patient(String name, String id, String email, String phone, String address,
                   Gender gender, String birthDate) {

        super(name, id, email, phone, address);
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public InsurancePolicy getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }
}
