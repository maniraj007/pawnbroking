package com.maniraj.pawnbroking.PawnBrokingApp;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Long> {
    List<Address> findByAddress(String address);

    Address findById(long id);
}
