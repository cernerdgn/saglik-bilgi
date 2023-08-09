package com.example.demo.Repository;

import com.example.demo.model.Vatandas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface Hastane_Repository extends JpaRepository<Vatandas,Long> {

    Optional<Vatandas> findById(Long hastaneId);



}
