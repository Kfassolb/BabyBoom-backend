package com.babyboom.controllers;

import com.babyboom.dtos.ApoderadoDTO;
import com.babyboom.dtos.BebeDTO;
import com.babyboom.entities.Apoderado;
import com.babyboom.entities.Bebe;
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
    private IApoderadoService aS;

    @PostMapping
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
}
