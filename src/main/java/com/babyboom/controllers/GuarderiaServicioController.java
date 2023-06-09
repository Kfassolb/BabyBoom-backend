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
@RequestMapping("/guarderiaservicio")
public class GuarderiaServicioController {
    @Autowired
    private IGuarderiaServicioService iGSs;
    @PostMapping
    public void insert(@RequestBody GuarderiaServicioDTO dto){
        ModelMapper m=new ModelMapper();
        GuarderiaServicio gs=m.map(dto, GuarderiaServicio.class);
        iGSs.insert(gs);
    }
    @GetMapping
    public List<GuarderiaServicioDTO> list(){
        return iGSs.list().stream().map(x -> {
            ModelMapper m=new ModelMapper();
            return m.map(x, GuarderiaServicioDTO.class);
        }).collect(Collectors.toList());
    }
}
