 package com.Automotora.ventadeautos.Auto;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class auto {
   @Id
   @GeneratedValue 
   private Integer id;
   @Basic
   private String marca;
   private String modelo;
   private Integer anio ;



}
