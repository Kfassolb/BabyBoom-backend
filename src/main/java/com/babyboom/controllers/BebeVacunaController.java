package com.babyboom.controllers;

import com.babyboom.dtos.BebeVacunaDTO;
import com.babyboom.entities.BebeVacuna;
import com.babyboom.servicies.IBebeVacunaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
}
