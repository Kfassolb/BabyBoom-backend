package com.babyboom.controllers;

import com.babyboom.dtos.MedicoDTO;
import com.babyboom.dtos.UserDTO;
import com.babyboom.entities.Medico;
import com.babyboom.services.IMedicoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private IMedicoService medicoService;

    @PostMapping()
    public void insert(@RequestBody MedicoDTO mdto) {
        ModelMapper mp = new ModelMapper();
        Medico medico = mp.map(mdto, Medico.class);
        medicoService.insert(medico);
    }

    @GetMapping
    public List<MedicoDTO> list() {
        return medicoService.list().stream().map(x -> {
            ModelMapper mp = new ModelMapper();
            return mp.map(x, MedicoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idMedico) {
        medicoService.delete(idMedico);
    }

    @GetMapping("/{id}")
    public MedicoDTO listId(@PathVariable("id") Integer idMedico){
        ModelMapper mp = new ModelMapper();
        MedicoDTO mdto = mp.map(medicoService.listId(idMedico), MedicoDTO.class);
        return mdto;
    }

    @PutMapping()
    public void update (@RequestBody MedicoDTO mdto){
        ModelMapper mp = new ModelMapper();
        Medico medico = mp.map(mdto, Medico.class);
        medicoService.insert(medico);
    }
}
