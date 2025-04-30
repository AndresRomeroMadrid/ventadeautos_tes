package com.Automotora.ventadeautos.Auto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AutoRepository extends  JpaRepository<auto, Integer> {

}
