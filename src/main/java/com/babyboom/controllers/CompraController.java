package com.babyboom.controllers;

import com.babyboom.dtos.ApoderadoDTO;
import com.babyboom.dtos.CompraDTO;
import com.babyboom.entities.Compra;
import com.babyboom.services.ICompraService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/compras")
public class CompraController {
    @Autowired
    private ICompraService cS;

    @PostMapping()
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

    @PostMapping("/buscar")
    public List<CompraDTO> buscar(@RequestBody LocalDate fecha) {
        return cS.buscarFecha(fecha).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CompraDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public CompraDTO listId(@PathVariable("id") Integer idCompra){
        ModelMapper mp = new ModelMapper();
        CompraDTO dto = mp.map(cS.listId(idCompra), CompraDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody CompraDTO dto){
        ModelMapper m = new ModelMapper();
        Compra t =m.map(dto,Compra.class);
        cS.insert(t);
    }
}
