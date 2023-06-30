package com.babyboom.controllers;

import com.babyboom.dtos.BebeVacunaDTO;
import com.babyboom.dtos.CitamedicaDTO;
import com.babyboom.entities.BebeVacuna;
import com.babyboom.entities.Citamedica;
import com.babyboom.services.IBebeVacunaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bebevacunas")
public class BebeVacunaController {
    @Autowired
    private IBebeVacunaService iBVs;
    @GetMapping
    public List<BebeVacunaDTO> list(){
        return iBVs.list().stream().map(x -> {
            ModelMapper m=new ModelMapper();
            return m.map(x,BebeVacunaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insert(@RequestBody BebeVacunaDTO cmdto) {
        ModelMapper mp = new ModelMapper();
        BebeVacuna bebeVacuna = mp.map(cmdto, BebeVacuna.class);
        iBVs.insert(bebeVacuna);
    }
}
