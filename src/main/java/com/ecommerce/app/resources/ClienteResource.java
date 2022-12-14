package com.ecommerce.app.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.app.entities.Cliente;
import com.ecommerce.app.services.ClienteService;

@RestController
@RequestMapping(value = "/users")
public class ClienteResource {
    
    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<List<Cliente>> findAll(){
        List<Cliente> list = clienteService.findAll();
        return ResponseEntity.status(200).body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id){
        Cliente cliente = clienteService.findById(id);
        return ResponseEntity.status(200).body(cliente);
}
}