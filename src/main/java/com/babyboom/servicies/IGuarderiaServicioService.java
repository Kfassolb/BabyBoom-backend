package com.babyboom.servicies;

import com.babyboom.entities.GuarderiaServicio;
import com.babyboom.entities.Servicio;

import java.util.List;

public interface IGuarderiaServicioService {
    public void insert(GuarderiaServicio guarderiaServicio);
    List<GuarderiaServicio> list();
    public void delete(int idServicio);

}
