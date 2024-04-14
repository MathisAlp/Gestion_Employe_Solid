package com.example.entities;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Service {
    private static Long nbreServ=0L;
    private Long id;
    private String code;
    private String nom;
    private ArrayList<Contractuel> listContractuels;

    public Service() {
        id=++nbreServ;
    }

    @Override
    public String toString() {
        System.out.println("----------------------------------------------------------------");
        return "Service [id=" + id + ", code=" + code + ", nom=" + nom + "]";
    }

    

}
