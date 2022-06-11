package com.example.demo.repository;

import com.example.demo.entities.Nationalite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NationalitesRepository extends JpaRepository<Nationalite,Integer> {
}
