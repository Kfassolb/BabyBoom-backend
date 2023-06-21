package com.babyboom.controllers;

import com.babyboom.dtos.GuarderiaServicioDTO;
import com.babyboom.services.IGuarderiaServicioService;
import org.modelmapper.ModelMapper;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/guarderiaservicios ")
public class GuarderiaServicioController {
    private IGuarderiaServicioService gS;
    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<GuarderiaServicioDTO> listar() {
        return gS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, GuarderiaServicioDTO.class);
        }).collect(Collectors.toList());
    }
}
