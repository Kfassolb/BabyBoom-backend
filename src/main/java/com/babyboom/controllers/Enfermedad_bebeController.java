package com.babyboom.controllers;

import com.babyboom.dtos.BebeDTO;
import com.babyboom.dtos.Enfermedad_bebeDTO;
import com.babyboom.entities.Bebe;
import com.babyboom.entities.Enfermedad_bebe;
import com.babyboom.services.IEnfermedad_BebeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/enfermedad-bebes")
public class Enfermedad_bebeController {
    @Autowired
    private IEnfermedad_BebeService fS;

    @PostMapping
    public void insert(@RequestBody Enfermedad_bebeDTO dto){
        ModelMapper m=new ModelMapper();
        Enfermedad_bebe b=m.map(dto, Enfermedad_bebe.class);
        fS.insert(b);
    }

    @GetMapping
    public List<Enfermedad_bebeDTO> list(){
        return fS.list().stream().map(x->{
            ModelMapper m =new ModelMapper();
            return m.map(x,Enfermedad_bebeDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        fS.delete(id);
    }

    @GetMapping("/{id}")
    public  Enfermedad_bebeDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        Enfermedad_bebeDTO dto=m.map(fS.listId(id),Enfermedad_bebeDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody Enfermedad_bebeDTO dto){
        ModelMapper m=new ModelMapper();
        Enfermedad_bebe b=m.map(dto,Enfermedad_bebe.class);
        fS.insert(b);
    }
}
