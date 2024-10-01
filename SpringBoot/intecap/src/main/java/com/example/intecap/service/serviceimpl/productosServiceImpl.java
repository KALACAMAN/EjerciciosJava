package com.example.intecap.service.serviceimpl;

import java.util.Optional;
import org.springframework.stereotype.Service;

import com.example.intecap.common.CommonSvcImpl;
import com.example.intecap.models.productosModel;
import com.example.intecap.repository.productosRepository;
import com.example.intecap.service.productosService;

@Service
public class productosServiceImpl extends CommonSvcImpl<productosModel, productosRepository> implements productosService {
    
    @Override
    public void deleteById(int id){
        this.repository.deleteById(id);
    }

    @Override
    public Iterable<productosModel> findAll(){
        return this.repository.findAll();
    }

    @Override
    public Optional<productosModel> findById(int id){
        return this.repository.findById(id);
    }

    @Override
    public productosModel save(productosModel entity){
        return this.repository.save(entity);
    }

    @Override
    public Iterable<productosModel> saveAll(Iterable<productosModel> entites){
        return this.repository.saveAll(entites);
    }

   @Override
   public productosModel findByNombre(String nombre){
        return this.repository.findByNombre(nombre);
   }

@Override
public boolean existsById(int idProducto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'existsById'");
}

@Override
public boolean existsById(int idProducto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'existsById'");
}
    
}