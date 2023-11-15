package br.uniceub.dianome.controllers;

import br.uniceub.dianome.models.EntregadorModel;
import br.uniceub.dianome.repsitories.EntregadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntregadorController {
    @Autowired
    EntregadorRepository repository;

    public ResponseEntity<List<EntregadorModel>> listar(){
        List<EntregadorModel> entregadorList = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(entregadorList);
    }
}
