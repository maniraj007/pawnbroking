package com.maniraj.pawnbroking.PawnBrokingApp;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Clients, Long> {

    List<Clients> findByLastName(String lastName);

    Clients findById(long id);

    @Query("SELECT t from Table1 t where t.id%2=1")
    List<Clients> findAllByOddIds();

}
