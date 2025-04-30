package com.Automotora.ventadeautos.Auto;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AutoService {
     

    private final AutoRepository autoRepo;


    public void createAuto(auto auto){
        autoRepo.save(auto);
    }
     
    

    
}
