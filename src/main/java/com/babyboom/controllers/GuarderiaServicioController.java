package com.babyboom.controllers;

import com.babyboom.dtos.GuarderiaServicioDTO;
import com.babyboom.dtos.MedicoDTO;
import com.babyboom.entities.GuarderiaServicio;
import com.babyboom.entities.Medico;
import com.babyboom.services.IGuarderiaServicioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/guarderiaservicios")
public class GuarderiaServicioController {
    @Autowired
    private IGuarderiaServicioService gS;
    @GetMapping
    public List<GuarderiaServicioDTO> list() {
        return gS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, GuarderiaServicioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insert(@RequestBody GuarderiaServicioDTO mdto) {
        ModelMapper mp = new ModelMapper();
        GuarderiaServicio guarderiaServicio = mp.map(mdto, GuarderiaServicio.class);
        gS.insert(guarderiaServicio);
    }
}
