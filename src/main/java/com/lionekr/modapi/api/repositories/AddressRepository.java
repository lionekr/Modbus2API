package com.lionekr.modapi.api.repositories;

import com.lionekr.modapi.api.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    Address findByName(String name);
}
