package com.babyboom.controllers;

import com.babyboom.entities.Tipocomprobante;
import io.swagger.models.Model;
import org.modelmapper.ModelMapper;
import com.babyboom.dtos.TipocomprobanteDTO;
import com.babyboom.services.ITipocomprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipocomprobantes")
public class TipocomprobanteController {
    @Autowired
    private ITipocomprobanteService tcS;

    //insert
    @PostMapping
    public void insert(@RequestBody TipocomprobanteDTO dto){
        ModelMapper m = new ModelMapper();
        Tipocomprobante t = m.map(dto, Tipocomprobante.class);
        tcS.insert(t);
    }

    //List

    @GetMapping
    public List<TipocomprobanteDTO>list(){
            return tcS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,TipocomprobanteDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
        public void delete(@PathVariable("id")Integer id){
        tcS.delete(id);
    }

    @GetMapping("/{id}")
    public TipocomprobanteDTO listId(@PathVariable("id")Integer id){
    ModelMapper m = new ModelMapper();
    TipocomprobanteDTO dto = m.map(tcS.listId(id),TipocomprobanteDTO.class);
    return dto;
}

    @PutMapping
    public void goUpdate(@RequestBody TipocomprobanteDTO dto){
        ModelMapper m = new ModelMapper();
        Tipocomprobante t =m.map(dto,Tipocomprobante.class);
        tcS.insert(t);
    }
}
