package com.babyboom.controllers;
import com.babyboom.dtos.GuarderiaServicioDTO;
import com.babyboom.entities.GuarderiaServicio;
import com.babyboom.servicies.IGuarderiaServicioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/guarderiaservicios")
public class GuarderiaServicioController {
    @Autowired
    private IGuarderiaServicioService iGSs;
    @GetMapping
    public List<GuarderiaServicioDTO> list(){
        return iGSs.list().stream().map(x -> {
            ModelMapper m=new ModelMapper();
            return m.map(x, GuarderiaServicioDTO.class);
        }).collect(Collectors.toList());
    }
}
