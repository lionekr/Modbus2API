package com.lionekr.modapi.api.controller;

import com.lionekr.modapi.api.model.Address;
import com.lionekr.modapi.api.repositories.AddressRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ModbusRequestAPI {
    private final AddressRepository addressRepository;

    public ModbusRequestAPI(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @GetMapping("/addresses")
    public List<Address> all() {
        return addressRepository.findAll();
    }


}
