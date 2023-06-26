package com.babyboom.controllers;

import com.babyboom.dtos.ApoderadoDTO;
import com.babyboom.dtos.CitamedicaDTO;
import com.babyboom.dtos.MedicoDTO;
import com.babyboom.dtos.Reportellb1DTO;
import com.babyboom.entities.Apoderado;
import com.babyboom.entities.Citamedica;
import com.babyboom.entities.Medico;
import com.babyboom.services.ICitamedicaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citas")
public class CitamedicaController {
    @Autowired
    private ICitamedicaService citamedicaS;

    @PostMapping()
    public void insert(@RequestBody CitamedicaDTO cmdto) {
        ModelMapper mp = new ModelMapper();
        Citamedica citamedica = mp.map(cmdto, Citamedica.class);
        citamedicaS.insert(citamedica);
    }

    @GetMapping
    public List<CitamedicaDTO> list() {
        return citamedicaS.list().stream().map(x -> {
            ModelMapper mp = new ModelMapper();
            return mp.map(x, CitamedicaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idCita) {
        citamedicaS.delete(idCita);
    }

    @GetMapping("/{id}")
    public CitamedicaDTO listId(@PathVariable("id") Integer idCita){
        ModelMapper mp = new ModelMapper();
        CitamedicaDTO cmdto = mp.map(citamedicaS.listId(idCita), CitamedicaDTO.class);
        return cmdto;
    }

    @PutMapping()
    public void update (@RequestBody CitamedicaDTO cmdto){
        ModelMapper mp = new ModelMapper();
        Citamedica citamedica = mp.map(cmdto, Citamedica.class);
        citamedicaS.insert(citamedica);
    }

    @GetMapping("/place-count")
    public List<Reportellb1DTO> getCountByplace() {
        List<Reportellb1DTO> reportellb1DTOS = citamedicaS.reportellb1();
        return reportellb1DTOS;
    }
}
