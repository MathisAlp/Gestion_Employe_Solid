package com.example.repository.interfaces;

import java.util.List;

import com.example.entities.Employe;

public interface IEmployeRepository {
    Employe findEmployeByMatricule(String num);
    void save(Employe emp);
    List<Employe> findAllEmployes();
}
