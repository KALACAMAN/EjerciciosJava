package com.example.intecap.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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
    public ResponseEntity<Iterable<productosModel>> getProductos() {
        return ResponseEntity.ok(productosService.findAll());
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> saveProductos(@Validated @RequestBody productosModel entity) {
        try {
            productosService.save(entity);
            return ResponseEntity.ok("Producto guardado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body("Error al guardar el producto: " + e.getMessage());
        }
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<String> deleteProductos(@RequestBody int idProducto) {
        try {
            if (productosService.existsById(idProducto)) {
                productosService.deleteById(idProducto);
                return ResponseEntity.ok("Producto eliminado exitosamente");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                     .body("Producto no encontrado");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body("Error al eliminar el producto: " + e.getMessage());
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<String> updateProductos(@RequestBody productosModel entity) {
        try {
            Optional<productosModel> existingProducto = productosService.findById(entity.getId());

            if (existingProducto.isPresent()) {
                productosModel productoToUpdate = existingProducto.get();
                productoToUpdate.setNombre(entity.getNombre());
                productoToUpdate.setPrecio(entity.getPrecio());
                productoToUpdate.setStock(entity.getStock());

                productosService.save(productoToUpdate);
                return ResponseEntity.ok("Producto actualizado exitosamente");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                     .body("Producto no encontrado");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body("Error al actualizar el producto: " + e.getMessage());
        }
    }
}
