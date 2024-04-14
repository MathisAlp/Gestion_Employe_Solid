package com.example.repository.list;

import java.util.ArrayList;
import java.util.List;

import com.example.entities.Employe;
import com.example.repository.interfaces.IEmployeRepository;

public class EmployeRepository implements IEmployeRepository {
    List<Employe> emps = new ArrayList<>();

    @Override
    public Employe findEmployeByMatricule(String mat) {
        return emps.stream().filter(c->c.getMatricule().compareToIgnoreCase(mat)==0).findFirst().orElse(null);
    }

    @Override
    public void save(Employe emp) {
        emps.add(emp);
    }

    @Override
    public List<Employe> findAllEmployes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllEmployes'");
    }

}
