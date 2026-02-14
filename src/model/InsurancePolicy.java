package model;

public class InsurancePolicy {

    private String companyName;
    private String policyNumber;
    private boolean active;
    private String expirationDate;

    public InsurancePolicy(String companyName, String policyNumber, boolean active, String expirationDate) {
        this.companyName = companyName;
        this.policyNumber = policyNumber;
        this.active = active;
        this.expirationDate = expirationDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public boolean isActive() {
        return active;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
