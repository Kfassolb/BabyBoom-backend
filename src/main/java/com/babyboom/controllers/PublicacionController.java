package com.babyboom.controllers;

import com.babyboom.dtos.PublicacionDTO;
import com.babyboom.entities.Publicacion;
import com.babyboom.services.IPublicacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/publicaciones")
public class PublicacionController {
    @Autowired
    private IPublicacionService pS;

    //INSERT
    @PostMapping
    public void insert(@RequestBody PublicacionDTO dto){
        ModelMapper m=new ModelMapper();
        Publicacion p=m.map(dto,Publicacion.class);
        pS.insert(p);
    }
    //list
    @GetMapping
    public List<PublicacionDTO>list(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, PublicacionDTO.class);
        }).collect(Collectors.toList());
    }
}
