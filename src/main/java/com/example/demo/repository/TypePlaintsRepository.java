package com.example.demo.repository;

import com.example.demo.entities.TypePlaints;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypePlaintsRepository extends JpaRepository<TypePlaints, Integer> {


    TypePlaints findByName(String name);
}
