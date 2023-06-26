package com.babyboom.services;

import com.babyboom.dtos.CompraFechaDTO;
import com.babyboom.dtos.GuarderiaSideDTO;
import com.babyboom.entities.Compra;

import java.time.LocalDate;
import java.util.List;

public interface ICompraService {
    public void insert(Compra compra);

    List<Compra>list();

    List<Compra> buscarFecha(LocalDate fecha);


}