package com.ecommerce.app.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable{

   private static final long serialVersionUid = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   
   private String phone;
   private String name;
   private String email;
   private String password;

}
