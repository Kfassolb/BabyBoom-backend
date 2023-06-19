package com.babyboom.services;
import com.babyboom.entities.Servicio;
import java.util.List;
public interface IServicioService {
    public void insert(Servicio servicio);
    List<Servicio>list();
    public void delete(int idServicio);
    public Servicio listId(int idServicio);
}
