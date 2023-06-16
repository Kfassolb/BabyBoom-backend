package com.babyboom.controllers;

import com.babyboom.dtos.CitamedicaDTO;
import com.babyboom.dtos.MedicoDTO;
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
}
