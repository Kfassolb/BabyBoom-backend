package com.babyboom.controllers;


import com.babyboom.dtos.ProductoDTO;
import com.babyboom.dtos.SoportetecnicoDTO;
import com.babyboom.entities.Soportetecnico;
import com.babyboom.services.ISoportetecnicoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/soportetecnico")
public class SoportetecnicoController {
    @Autowired
    private ISoportetecnicoService tS;

    //insert

    @PostMapping
    public void insert(@RequestBody SoportetecnicoDTO dto) {
        ModelMapper m= new ModelMapper();
        Soportetecnico t = m.map(dto, Soportetecnico.class);
        tS.insert(t);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<SoportetecnicoDTO> list(){
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SoportetecnicoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {tS.delete(id);}

    @GetMapping("/{id}")
    public SoportetecnicoDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        SoportetecnicoDTO dto = m.map(tS.listId(id), SoportetecnicoDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody SoportetecnicoDTO dto){
        ModelMapper m = new ModelMapper();
        Soportetecnico t = m.map(dto, Soportetecnico.class);
        tS.insert(t);
    }

}
