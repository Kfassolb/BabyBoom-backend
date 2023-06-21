package com.babyboom.controllers;

import com.babyboom.dtos.ApoderadoDTO;
import com.babyboom.entities.Apoderado;
import com.babyboom.services.IApoderadoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/apoderados")
public class ApoderadoController {
    @Autowired
    private IApoderadoService apoderadoService;

    @PostMapping()
    public void insert(@RequestBody ApoderadoDTO adto) {
        ModelMapper mp = new ModelMapper();
        Apoderado apoderado = mp.map(adto, Apoderado.class);
        apoderadoService.insert(apoderado);
    }

    @GetMapping
    public List<ApoderadoDTO> list() {
        return apoderadoService.list().stream().map(x -> {
            ModelMapper mp = new ModelMapper();
            return mp.map(x, ApoderadoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idApoderado) {
        apoderadoService.delete(idApoderado);
    }

    @GetMapping("/{id}")
    public ApoderadoDTO listId(@PathVariable("id") Integer idApoderado){
        ModelMapper mp = new ModelMapper();
        ApoderadoDTO adto = mp.map(apoderadoService.listId(idApoderado), ApoderadoDTO.class);
        return adto;
    }

    @PutMapping()
    public void update (@RequestBody ApoderadoDTO adto){
        ModelMapper mp = new ModelMapper();
        Apoderado apoderado = mp.map(adto, Apoderado.class);
        apoderadoService.insert(apoderado);
    }

}
