package com.example.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Journalier extends Employe {
    private int coutJ;
    private int nbreJour;


    @Override
    public void calculeSalaireNet() {
        salaire=(double) (coutJ*nbreJour);
        
    }

    
}
