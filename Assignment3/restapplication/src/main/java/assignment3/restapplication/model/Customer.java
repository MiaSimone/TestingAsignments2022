package assignment3.restapplication.model;


import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstname, lastname, phoneNr;

    public Customer(int id, String firstname, String lastname, String phoneNr) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNr = phoneNr;
    }

    public Customer() {}

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
