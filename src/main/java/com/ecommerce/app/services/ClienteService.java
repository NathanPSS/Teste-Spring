package com.ecommerce.app.services;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.app.entities.Cliente;
import com.ecommerce.app.repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll() {
      return repository.findAll();
    }

    public Cliente findById(Long id) {
       return repository.findById(id).get();
    }
}
