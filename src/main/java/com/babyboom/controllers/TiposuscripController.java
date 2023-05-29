package com.babyboom.controllers;

import com.babyboom.dtos.TiposuscripDTO;
import com.babyboom.entities.Tiposuscrip;
import com.babyboom.services.ITiposuscripService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tiposuscrips")
public class TiposuscripController {
    @Autowired
    private ITiposuscripService tS;

    //insert
@PostMapping
    public void insert(@RequestBody TiposuscripDTO dto){
    ModelMapper m=new ModelMapper();
    Tiposuscrip s=m.map(dto,Tiposuscrip.class);
tS.insert(s);
}
//list
@GetMapping
    public List<TiposuscripDTO> list(){
return tS.list().stream().map(x->{
ModelMapper m=new ModelMapper();
return m.map(x, TiposuscripDTO.class);
}).collect(Collectors.toList());
}
@DeleteMapping("/{id}")
public void delete(@PathVariable("id") Integer id) {tS.delete(id);}
@GetMapping("/{id}")
public TiposuscripDTO lisrId(@PathVariable("id") Integer id){
ModelMapper m=new ModelMapper();
TiposuscripDTO dto=m.map(tS.listId(id), TiposuscripDTO.class);
return dto;
}
@PutMapping
public void goUpdate(@RequestBody TiposuscripDTO dto){
ModelMapper m =new ModelMapper();
Tiposuscrip s=m.map(dto, Tiposuscrip.class);
tS.insert(s);
}
}
