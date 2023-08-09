
package com.example.demo.Service;


import com.example.demo.Repository.Hastane_Repository;
import com.example.demo.model.Vatandas;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service



public class HastaneService {


    private final Hastane_Repository hastane_repository;

    public HastaneService(Hastane_Repository hastane_repository) {
        this.hastane_repository = hastane_repository;
    }
    public Optional<Vatandas> findHastaneById(Long hastaneId){
        return hastane_repository.findById(hastaneId);

    }


}

