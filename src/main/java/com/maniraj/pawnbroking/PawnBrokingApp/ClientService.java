package com.maniraj.pawnbroking.PawnBrokingApp;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ClientService {

    @Autowired
    ClientRepository repository;

    public List<Clients> findAllByOddIds() {
        return repository.findAllByOddIds();
    }

    public List<Clients> findAll()
    {
        ArrayList<Clients> data = new ArrayList<Clients>();
        for (Clients clients : repository.findAll())
        {
            data.add(clients);
        }
        return data;
    }

    public Clients save(Clients data)
    {
        return repository.save(data);
    }

    public Clients findById(Integer id)
    {
        return repository.findById(id);
    }
}
