package com.babyboom.controllers;

import com.babyboom.dtos.ServicioDTO;
import com.babyboom.servicies.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/servicios"})
public class ServicioController {
    @Autowired
    private IServicioService sS;
    public ServicioController(){}
    @GetMapping
    public List<ServicioDTO> list(){

    }


}
