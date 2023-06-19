package com.babyboom.controllers;

import com.babyboom.dtos.BebeDTO;
import com.babyboom.entities.Bebe;
import com.babyboom.services.IBebeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bebes")
public class BebeController {
    @Autowired
    private IBebeService bS;

    @PostMapping
    public void insert(@RequestBody BebeDTO dto){
        ModelMapper m=new ModelMapper();
        Bebe b=m.map(dto, Bebe.class);
        bS.insert(b);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<BebeDTO> list(){
        return bS.list().stream().map(x->{
            ModelMapper m =new ModelMapper();
            return m.map(x,BebeDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        bS.delete(id);
    }

    @GetMapping("/{id}")
    public  BebeDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        BebeDTO dto=m.map(bS.listId(id),BebeDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody BebeDTO dto){
        ModelMapper m=new ModelMapper();
        Bebe b=m.map(dto,Bebe.class);
        bS.insert(b);
    }
    @PostMapping("/buscarfecha")
    List<BebeDTO>search(@RequestBody LocalDate fecha){
        return bS.findByFechaBebe(fecha).stream().map(x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x,BebeDTO.class);
        }).collect(Collectors.toList());
    }



}
