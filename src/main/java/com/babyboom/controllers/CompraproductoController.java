package com.babyboom.controllers;


import com.babyboom.dtos.CompraproductoDTO;
import com.babyboom.entities.Compraproducto;
import com.babyboom.services.ICompraproductoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/compraproducto")
public class CompraproductoController {

    @Autowired
    private ICompraproductoService cS;

    @PostMapping
    public void registrar(@RequestBody CompraproductoDTO cDTO) {
        ModelMapper m = new ModelMapper();
        Compraproducto c = m.map(cDTO, Compraproducto.class);
        cS .insert(c);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<CompraproductoDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CompraproductoDTO.class);
        }).collect(Collectors.toList());
    }

}
