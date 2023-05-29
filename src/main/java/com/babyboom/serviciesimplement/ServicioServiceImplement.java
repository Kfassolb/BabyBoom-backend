package com.babyboom.serviciesimplement;

import com.babyboom.entities.Servicio;
import com.babyboom.repositories.IServicioRepository;
import com.babyboom.servicies.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioServiceImplement implements IServicioService {

    @Autowired
    private IServicioRepository sR;

    public ServicioServiceImplement(){
    }


    public void insert(Servicio servicio) {
        this.sR.save(servicio);}
    public List<Servicio> list() {
        return this.sR.findAll();}
    public void delete(int idServicio) {
        this.sR.deleteById(idServicio);}
}
