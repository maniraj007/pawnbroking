package com.maniraj.pawnbroking.PawnBrokingApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author pankaj
 *
 */
@Entity
@Table(name="Address")
public class Address {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String address;

    protected Address() {}

    public Address(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format(
                "Address[id=%d, address='%s']",
                id, String.valueOf(address));
    }

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
}
