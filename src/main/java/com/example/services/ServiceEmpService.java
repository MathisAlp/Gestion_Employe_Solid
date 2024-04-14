package com.example.services;

import java.util.List;

import com.example.entities.Service;
import com.example.repository.interfaces.IServiceRepository;
import com.example.repository.list.ServiceRepository;

public class ServiceEmpService {
    IServiceRepository serviceRepository= new ServiceRepository();

    public Service getByCode(String code){
        return serviceRepository.findServiceByCode(code);
    }

    public void addService(Service serv){
        serv.setCode("SRV"+serv.getId());
        serviceRepository.saveService(serv);
    }

    public List<Service> getAll(){
        return serviceRepository.findAllServices();
    }

}
