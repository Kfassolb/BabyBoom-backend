package com.babyboom.services;

import com.babyboom.entities.GuarderiaServicio;
import com.babyboom.entities.Medico;

import java.util.List;

public interface IGuarderiaServicioService {
    List<GuarderiaServicio> list();

    public void insert(GuarderiaServicio guarderiaServicio);
}

