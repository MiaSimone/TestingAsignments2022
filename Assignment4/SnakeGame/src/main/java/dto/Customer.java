package dto;

public class Customer {
    private final int id;
    private final String firstname, lastname, phoneNr;

    public Customer(int id, String firstname, String lastname, String phoneNr) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNr = phoneNr;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
