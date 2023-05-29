package com.babyboom.controllers;

import com.babyboom.dtos.UsuarioDTO;
import com.babyboom.entities.Usuario;
import com.babyboom.services.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("/insert")
    public void insert(@RequestBody UsuarioDTO udto){
        ModelMapper mp = new ModelMapper();
        Usuario usuario = mp.map(udto,Usuario.class);
        usuarioService.insert(usuario);
    }
    @GetMapping
    public List<UsuarioDTO> list(){
        return usuarioService.list().stream().map(x->{
            ModelMapper mp= new ModelMapper();
            return mp.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idUsuario){
        usuarioService.delete(idUsuario);
    }

    @GetMapping({"/{id}"})
    public UsuarioDTO listId(@PathVariable("id") Integer idUsuario){
        ModelMapper mp= new ModelMapper();
        UsuarioDTO udto = mp.map(usuarioService.listId(idUsuario), UsuarioDTO.class);
        return udto;
    }

    @PutMapping("/update")
    public void update (@RequestBody UsuarioDTO udto){
        ModelMapper mp = new ModelMapper();
        Usuario usuario = mp.map(udto, Usuario.class);
        usuarioService.insert(usuario);
    }
}
