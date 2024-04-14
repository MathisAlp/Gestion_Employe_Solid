package com.example.repository.interfaces;


import java.util.List;

import com.example.entities.Service;

public interface IServiceRepository {
    Service findServiceByCode(String num);
    void saveService(Service serv);
    List<Service> findAllServices();

}
