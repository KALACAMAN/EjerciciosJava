package com.example.intecap.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.intecap.models.productosModel;
import com.example.intecap.service.productosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/productos")
@CrossOrigin
public class productosController {

    @Autowired
    private productosService productosService;
    
    @GetMapping("/listar")
    public Iterable<productosModel> getProductos(){
        return this.productosService.findAll();
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> saveProductos(@RequestBody productosModel entity){

        try{
            this.productosService.save(entity);
            return ResponseEntity.ok("Producto guardado exitosamente");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error al guardar el producto");
        }
    }

    @DeleteMapping("/eliminar/{idProducto}")
    public ResponseEntity<String> deleteProductos(@PathVariable int idProducto){
        try{
            this.productosService.deleteById(idProducto);
            return ResponseEntity.ok("producto eliminado exitosamente");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error al eliminar el producto");
        }
    }

    @PutMapping("/actualizar/{idProducto}")
    public ResponseEntity<String> updateProductos(@PathVariable int idProducto, @RequestBody productosModel entity){
        try{
            Optional<productosModel> existingProducto = this.productosService.findById((idProducto));

            if(existingProducto.isPresent()){
                productosModel productoToUpdate = existingProducto.get();

                productoToUpdate.setNombre(entity.getNombre());
                productoToUpdate.setPrecio(entity.getPrecio());
                productoToUpdate.setStock(entity.getStock());

                this.productosService.save(productoToUpdate);
                this.productosService.save(entity);
                return ResponseEntity.ok("Producto actualizado exitosamente");
            }else{
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Producto no encontrado");
            }
        }catch(Exception e){
            return ResponseEntity.badRequest().body("Error al actualizar el producto");
        }
    }
 
    
    
    
}
