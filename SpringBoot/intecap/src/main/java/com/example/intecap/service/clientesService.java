package com.example.intecap.service;

import java.util.Optional;

import com.example.intecap.common.CommonSvc;
import com.example.intecap.models.clientesModel;

public interface clientesService extends CommonSvc<clientesModel> {

    public Iterable<clientesModel> findAll();

    public Optional<clientesModel> findById(int id);

    public clientesModel save(clientesModel entity);

    public void deleteById(int id);

    clientesModel findByNombre(String nombre);

    Iterable<clientesModel> saveAll(Iterable<clientesModel> entities);    
}
