package com.ecommerce.app.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ecommerce.app.entities.Cliente;
import com.ecommerce.app.repositories.ClienteRepository;



@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void run(String... args) throws Exception {
        Cliente cl1 = new Cliente(1L,"98000-222","Maria","maria@gmail.com","123456");
        Cliente cl2 = new Cliente(2L,"93332-222","Joao","joao@gmail.com","654123");
        Cliente cl3 = new Cliente(3L,"98722-222","Cassio","cassio@gmail.com","123654");

        this.clienteRepository.saveAll(Arrays.asList(cl1,cl2,cl3));
    }   
}
