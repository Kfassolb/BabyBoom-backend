package com.babyboom.controllers;

import com.babyboom.dtos.GuarderiaDTO;
import com.babyboom.dtos.TipocomprobanteDTO;
import com.babyboom.entities.Guarderia;
import com.babyboom.entities.Tipocomprobante;
import com.babyboom.services.IGuarderiaService;
import com.babyboom.services.ITipocomprobanteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/guarderias")
public class GuarderiaController {
    @Autowired
    private IGuarderiaService gS;

    @PostMapping
    public void insert(@RequestBody GuarderiaDTO dto){
        ModelMapper m = new ModelMapper();
        Guarderia g = m.map(dto, Guarderia.class);
        gS.insert(g);
    }

    //List

    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<GuarderiaDTO> list(){
        return gS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,GuarderiaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        gS.delete(id);
    }

    @GetMapping("/{id}")
    public GuarderiaDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        GuarderiaDTO dto = m.map(gS.listId(id),GuarderiaDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody GuarderiaDTO dto){
        ModelMapper m = new ModelMapper();
        Guarderia t =m.map(dto,Guarderia.class);
        gS.insert(t);
    }
}
