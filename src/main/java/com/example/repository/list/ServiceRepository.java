package com.example.repository.list;

import java.util.ArrayList;
import java.util.List;

import com.example.entities.Service;
import com.example.repository.interfaces.IServiceRepository;

public class ServiceRepository implements IServiceRepository {
    List<Service> services = new ArrayList<>();

    @Override
    public Service findServiceByCode(String code) {
        return services.stream().filter(c->c.getCode().compareToIgnoreCase(code)==0).findFirst().orElse(null);
    }

    @Override
    public void saveService(Service serv) {
        services.add(serv);
    }

    @Override
    public List<Service> findAllServices() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllServices'");
    }

   

}
