package com.example.intecap.service.serviceimpl;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.intecap.common.CommonSvcImpl;
import com.example.intecap.models.clientesModel;
import com.example.intecap.repository.clienteRepository;
import com.example.intecap.service.clientesService;

@Service
public class clientesServiceImpl extends CommonSvcImpl<clientesModel, clienteRepository> implements clientesService {


    private Object repository;

    @SuppressWarnings("unchecked")
    @Override
    public Iterable<clientesModel> findAll() {
        return ((CrudRepository<clientesModel, Object>) this.repository).findAll();
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public Optional<clientesModel> findById(int id) {
        return ((CrudRepository<clientesModel, Object>) this.repository).findById(id);
    }
 
    @Override
    public clientesModel findByNombre(String nombre) {
        return ((clienteRepository) this.repository).findByNombre(nombre);
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public clientesModel save(clientesModel entity) {
        return ((CrudRepository<clientesModel, Object>) this.repository).save(entity);
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public void deleteById(int id) {
        ((CrudRepository<clientesModel, Object>) this.repository).deleteById(id);
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public Iterable<clientesModel> saveAll(Iterable<clientesModel> entities) {
        return ((CrudRepository<clientesModel, Object>) this.repository).saveAll(entities);
    }

    @Override
    public boolean existsById(int idCliente) {
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }
}
