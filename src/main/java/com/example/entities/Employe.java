package com.example.entities;

import com.example.enums.EtatEmp;
import com.example.enums.TypeCompte;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Employe implements IEmploye{
    private static Long nbreEmploye=0L;
    protected Long id; 
    protected String matricule;
    protected EtatEmp etatEmp;
    protected TypeCompte type;
    protected Double salaire;


    public Employe(){
        id=++nbreEmploye;
    }

}
