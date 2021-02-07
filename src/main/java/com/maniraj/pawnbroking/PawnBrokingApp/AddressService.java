package com.maniraj.pawnbroking.PawnBrokingApp;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AddressService {
    @Autowired
    AddressRepository repository;

    public List<Address> findAll()
    {
        ArrayList<Address> data = new ArrayList<Address>();
        for (Address address: repository.findAll())
        {
            data.add(address);
        }
        return data;
    }

    public Address save(Address data)
    {
        return repository.save(data);
    }

    public Address findById(Integer id)
    {
        return repository.findById(id);
    }
}
