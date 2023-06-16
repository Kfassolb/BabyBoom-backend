package com.babyboom.controllers;

import com.babyboom.dtos.ProblemaDTO;
import com.babyboom.entities.Problema;
import com.babyboom.services.IProblemaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/problema")
public class ProblemaController {

    @Autowired
    private IProblemaService pS;

    @PostMapping
    public void registrar(@RequestBody ProblemaDTO pDTO) {
        ModelMapper m = new ModelMapper();
        Problema p = m.map(pDTO, Problema.class);
        pS.insert(p);
    }

    @GetMapping
    public List<ProblemaDTO> listar() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProblemaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/buscar")
    public List<ProblemaDTO> buscar(@RequestBody LocalDate fecha) {
        return pS.buscarFecha(fecha).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProblemaDTO.class);
        }).collect(Collectors.toList());

    }
}
