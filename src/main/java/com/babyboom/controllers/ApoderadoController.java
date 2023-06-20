package com.babyboom.controllers;

import com.babyboom.dtos.ApoderadoDTO;
import com.babyboom.dtos.BebeDTO;
import com.babyboom.entities.Apoderado;
import com.babyboom.entities.Bebe;
import com.babyboom.entities.Comunidad;
import com.babyboom.services.IApoderadoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/apoderados")
public class ApoderadoController {

    @Autowired
    private IApoderadoService aS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody ApoderadoDTO dto){
        ModelMapper m=new ModelMapper();
        Apoderado b=m.map(dto, Apoderado.class);
        aS.insert(b);
    }

    @GetMapping
    public List<ApoderadoDTO> list(){
        return aS.list().stream().map(x->{
            ModelMapper m =new ModelMapper();
            return m.map(x,ApoderadoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        aS.delete(id);
    }

    @GetMapping("/{id}")
    public  ApoderadoDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        ApoderadoDTO dto=m.map(aS.listId(id),ApoderadoDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ApoderadoDTO dto){
        ModelMapper m =new ModelMapper();
        Apoderado s=m.map(dto, Apoderado.class);
        aS.insert(s);
    }
}
