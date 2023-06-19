package com.babyboom.controllers;
import com.babyboom.dtos.ServicioDTO;
import com.babyboom.entities.Servicio;
import com.babyboom.services.IServicioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/servicios")
public class ServicioController {
    @Autowired
    private IServicioService sS;
    @PostMapping
    public void insert(@RequestBody ServicioDTO dto){
        ModelMapper m=new ModelMapper();
        Servicio s=m.map(dto, Servicio.class);
        sS.insert(s);
    }
    @GetMapping
    public List<ServicioDTO> list(){
        return sS.list().stream().map(x -> {
            ModelMapper m=new ModelMapper();
            return m.map(x, ServicioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
       this.sS.delete(id);}
    @GetMapping("/{id}")
    public ServicioDTO listId(@PathVariable("id")Integer id){
    ModelMapper m=new ModelMapper();
    ServicioDTO dto=(ServicioDTO)m.map(this.sS.listId(id),ServicioDTO.class);
    return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody ServicioDTO dto){
        ModelMapper m=new ModelMapper();
        Servicio s=(Servicio)m.map(dto, Servicio.class);
        this.sS.insert(s);
    }

}
