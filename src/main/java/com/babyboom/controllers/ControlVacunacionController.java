package com.babyboom.controllers;

import com.babyboom.dtos.ControlVacunacionDTO;
import com.babyboom.entities.ControlVacunacion;
import com.babyboom.services.IControlVacunacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/controlvacunacion")
public class ControlVacunacionController {
    @Autowired
    private IControlVacunacionService iCVs;

    @PostMapping
    public void insert(@RequestBody ControlVacunacionDTO dto) {
        ModelMapper m = new ModelMapper();
        ControlVacunacion s = m.map(dto, ControlVacunacion.class);
        iCVs.insert(s);
    }

    @GetMapping
    public List<ControlVacunacionDTO> list() {
        return iCVs.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ControlVacunacionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        this.iCVs.delete(id);
    }
    @GetMapping("/{id}")
    public ControlVacunacionDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ControlVacunacionDTO dto = (ControlVacunacionDTO) m.map(this.iCVs.listId(id), ControlVacunacionDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody ControlVacunacionDTO dto) {
        ModelMapper m = new ModelMapper();
        ControlVacunacion cv = (ControlVacunacion) m.map(dto, ControlVacunacion.class);
        this.iCVs.insert(cv);
    }
}
