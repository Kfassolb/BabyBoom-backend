package com.babyboom.controllers;

import com.babyboom.dtos.BebeVacunaDTO;
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
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<BebeVacunaDTO> list(){
        return iBVs.list().stream().map(x -> {
            ModelMapper m=new ModelMapper();
            return m.map(x,BebeVacunaDTO.class);
        }).collect(Collectors.toList());
    }
}
