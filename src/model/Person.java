package model;

public abstract class Person {

    protected String name;
    protected String id;
    protected String email;
    protected String phone;
    protected String address;

    public Person(String name, String id, String email, String phone, String address) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
