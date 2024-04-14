package com.example.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Prestataire extends Employe {
    private String periodeService;
    private int coutPrestation;

    @Override
    public void calculeSalaireNet() {
        salaire=(double)coutPrestation;
        
    }
    
      
}
