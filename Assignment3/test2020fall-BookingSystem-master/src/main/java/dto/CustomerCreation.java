package dto;

public class CustomerCreation {
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public final String firstname, lastname, phoneNr;

    public CustomerCreation(String firstname, String lastname,String phoneNr) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNr = phoneNr;
    }
}
