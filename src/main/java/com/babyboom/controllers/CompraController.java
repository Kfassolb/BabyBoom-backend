package com.babyboom.controllers;

import com.babyboom.dtos.CompraDTO;
import com.babyboom.dtos.GuarderiaDTO;
import com.babyboom.entities.Compra;
import com.babyboom.entities.Guarderia;
import com.babyboom.services.ICompraService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/compras")
public class CompraController {
    @Autowired
    private ICompraService cS;

    @PostMapping
    public void insert(@RequestBody CompraDTO dto){
        ModelMapper m = new ModelMapper();
        Compra g = m.map(dto, Compra.class);
        cS.insert(g);
    }

    //List

    @GetMapping
    public List<CompraDTO> list(){
        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,CompraDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public CompraDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        CompraDTO dto = m.map(cS.listId(id),CompraDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody CompraDTO dto){
        ModelMapper m = new ModelMapper();
        Compra t =m.map(dto,Compra.class);
        cS.insert(t);
    }
}
