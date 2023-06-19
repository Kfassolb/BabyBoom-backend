package com.babyboom.controllers;

import com.babyboom.dtos.TipoEnfermedadDTO;
import com.babyboom.entities.TipoEnfermedad;
import com.babyboom.services.ITipoEnfermedadService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipoenfermedads")

public class TipoEnfermedadController {
    @Autowired
    private ITipoEnfermedadService pS;
    @PostMapping
    public void insert(@RequestBody TipoEnfermedadDTO dto){
        ModelMapper m=new ModelMapper();
        TipoEnfermedad p=m.map(dto, TipoEnfermedad.class);
        pS.insert(p);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<TipoEnfermedadDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m =new ModelMapper();
            return m.map(x,TipoEnfermedadDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public TipoEnfermedadDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        TipoEnfermedadDTO dto=m.map(pS.listId(id),TipoEnfermedadDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody TipoEnfermedadDTO dto){
        ModelMapper m=new ModelMapper();
        TipoEnfermedad p=m.map(dto,TipoEnfermedad.class);
        pS.insert(p);
    }

    @PostMapping("/buscarTipo")
    List<TipoEnfermedadDTO>search(@RequestParam String tipoTipoEnfermedad){
        return pS.findByTipoTipoEnfermedad(tipoTipoEnfermedad).stream().map(x ->{
            ModelMapper m= new ModelMapper();
            return m.map(x,TipoEnfermedadDTO.class);
        }).collect(Collectors.toList());
    }

}
