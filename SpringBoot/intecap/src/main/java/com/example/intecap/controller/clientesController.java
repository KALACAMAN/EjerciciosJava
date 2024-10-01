package com.example.intecap.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.intecap.models.clientesModel;
import com.example.intecap.service.clientesService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin
public class clientesController {

    @Autowired
    private clientesService clientesService;

    @GetMapping("/listar")
    public ResponseEntity<Iterable<clientesModel>> getClientes() {
        return ResponseEntity.ok(clientesService.findAll());
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> saveClientes(@RequestBody clientesModel entity) {
        try {
            clientesService.save(entity);
            return ResponseEntity.ok("Cliente guardado correctamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al guardar el cliente: " + e.getMessage());
        }
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<String> deleteClientes(@RequestBody int idCliente) {
        try {
            if (clientesService.existsById(idCliente)) {
                clientesService.deleteById(idCliente);
                return ResponseEntity.ok("Cliente eliminado correctamente");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar el cliente: " + e.getMessage());
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<String> updateClientes(@RequestBody clientesModel entity) {
        try {
            Optional<clientesModel> existingCliente = clientesService.findById(entity.getId());

            if (existingCliente.isPresent()) {
                clientesModel clienteToUpdate = existingCliente.get();
                clienteToUpdate.setNombre(entity.getNombre());
                clienteToUpdate.setApellido(entity.getApellido());

                clientesService.save(clienteToUpdate);
                return ResponseEntity.ok("Cliente actualizado correctamente");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar el cliente: " + e.getMessage());
        }
    }
}
