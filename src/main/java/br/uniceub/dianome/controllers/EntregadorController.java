package br.uniceub.dianome.controllers;

import br.uniceub.dianome.dtos.EntregadorDto;
import br.uniceub.dianome.models.EntregadorModel;
import br.uniceub.dianome.repsitories.EntregadorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EntregadorController {
    @Autowired
    EntregadorRepository repository;

    @GetMapping("/entregadores")
    public ResponseEntity<List<EntregadorModel>> listar(){
        List<EntregadorModel> entregadorList = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(entregadorList);
    }

    @PostMapping("/entregadores")
    public ResponseEntity<EntregadorModel> salvar(@RequestBody @Valid EntregadorDto dto){
        var entregadorModel = new EntregadorModel();
        BeanUtils.copyProperties(dto, entregadorModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(entregadorModel));
    }

    @GetMapping("/entregadores/{id}")
    public ResponseEntity<Object> detalhar(@PathVariable(value = "id") Integer id){
        Optional<EntregadorModel> entregador = repository.findById(id);
        if(entregador.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entregador não encontrado para exibição");
        }
        return ResponseEntity.status(HttpStatus.OK).body(entregador.get());
    }
}
