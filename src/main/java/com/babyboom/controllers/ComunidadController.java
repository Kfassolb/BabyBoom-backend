package com.babyboom.controllers;

import com.babyboom.dtos.CompraDTO;
import com.babyboom.dtos.ComunidadDTO;
import com.babyboom.entities.Comunidad;
import com.babyboom.services.IComunidadService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comunidades")
public class ComunidadController {
    @Autowired
    private IComunidadService cS;
    //insert
    @PostMapping
    public void insert(@RequestBody ComunidadDTO dto){
        ModelMapper m=new ModelMapper();
        Comunidad s=m.map(dto,Comunidad.class);
        cS.insert(s);
    }
    //list
    @GetMapping
    public List<ComunidadDTO> list(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, ComunidadDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {cS.delete(id);}
    @GetMapping("/{id}")
    public ComunidadDTO listId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ComunidadDTO dto=m.map(cS.listId(id), ComunidadDTO.class);
        return dto;
    }
    @PostMapping("/buscarlo")
    public List<ComunidadDTO> buscarlo(@RequestBody LocalDate FechaInicio) {
        return cS.buscarloFecha(FechaInicio).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComunidadDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void goUpdate(@RequestBody ComunidadDTO dto){
        ModelMapper m =new ModelMapper();
        Comunidad s=m.map(dto, Comunidad.class);
        cS.insert(s);
    }
}
