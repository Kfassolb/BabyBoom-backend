package com.babyboom.services;

import com.babyboom.entities.Problema;

import java.time.LocalDate;
import java.util.List;

public interface IProblemaService {

    public void insert(Problema problema);
    List<Problema> list();
    List<Problema> buscarFecha(LocalDate fechaInicio);

}
