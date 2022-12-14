package com.ecommerce.app.repositories;
import org.springframework.data.jpa.repository.JpaRepository;


import com.ecommerce.app.entities.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    
}
