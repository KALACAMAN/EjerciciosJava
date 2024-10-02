package com.example.intecap.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.intecap.models.productosModel;
import com.example.intecap.service.productosService;

@RestController
@RequestMapping("/productos")
@CrossOrigin
public class productosController {

    @Autowired
    private productosService productosService;

    @GetMapping("/listar")
    public Iterable<productosModel> getProductos() {
        return this.productosService.findAll();
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> saveProductos(@RequestBody productosModel entity) {

        try {
            this.productosService.save(entity);
            return ResponseEntity.ok("Producto guardado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al guardar el producto");
        }
    }

    @DeleteMapping("/eliminar/{idProducto}")
    public ResponseEntity<String> deleteProductos(@PathVariable int idProducto) {
        try {
            this.productosService.deleteById(idProducto);
            return ResponseEntity.ok("Producto eliminado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al eliminar el producto");
        }
    }

    @PutMapping("/actualizar/{idProducto}")
    public ResponseEntity<String> updateProductos(@PathVariable int idProducto, @RequestBody productosModel entity) {
        try {
            // Buscamos el id del producto
            Optional<productosModel> existingProducto = this.productosService.findById(idProducto);

            if (existingProducto.isPresent()) {
                productosModel productoToUpdate = existingProducto.get();

                productoToUpdate.setNombre(entity.getNombre());
                productoToUpdate.setPrecio(entity.getPrecio());
                productoToUpdate.setStock(entity.getStock());

                // Guardamos los cambios
                this.productosService.save(productoToUpdate);
                this.productosService.save(entity);
                return ResponseEntity.ok("Producto actualizado exitosamente");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Producto no encontrado");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al actualizar el producto");
        }
    }
}