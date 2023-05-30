package com.babyboom.controllers;

import com.babyboom.dtos.ServicioDTO;
import com.babyboom.entities.Servicio;
import com.babyboom.servicies.IServicioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicios")
public class ServicioController {
    @Autowired
    private IServicioService sS;
    @PostMapping
    public void insert(@RequestBody ServicioDTO dto){
        ModelMapper m=new ModelMapper();
        Servicio s=m.map(dto, Servicio.class);
        sS.insert(s);
    }
    @GetMapping
    public List<ServicioDTO> list(){
        return sS.list().stream().map(x -> {
            ModelMapper m=new ModelMapper();
            return m.map(x, ServicioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public ServicioDTO listId(@PathVariable("id" Integer id)){
        ModelMapper m= new ModelMapper();
        
    }

}
