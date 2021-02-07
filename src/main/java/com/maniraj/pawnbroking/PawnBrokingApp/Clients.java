package com.maniraj.pawnbroking.PawnBrokingApp;

import javax.persistence.*;


@Entity
@Table(name="Clients")
public class Clients {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @OneToOne
    @JoinColumn(name="id")
    private Address address;

    protected Clients() {}

    public Clients(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', address=%s]",
                id, firstName, lastName, String.valueOf(address));
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }
}
