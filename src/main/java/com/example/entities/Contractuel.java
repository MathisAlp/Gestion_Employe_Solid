package com.example.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Contractuel extends Employe {
    private int salaireBrut;
    private int retenu;
    private Double prime;
    private Double tauxPrime =0.1;
    private Service serv;

    @Override
    public void calculeSalaireNet() {
        salaire=salaireBrut+((salaireBrut*12)*tauxPrime)-retenu;
        
    }

    
}
