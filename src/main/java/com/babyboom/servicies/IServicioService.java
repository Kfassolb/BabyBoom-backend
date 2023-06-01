package com.babyboom.servicies;
import com.babyboom.entities.Servicio;
import java.util.List;
public interface IServicioService {
    void insert(Servicio servicio);
    List<Servicio> list();
    void delete(int idServicio);
    Servicio listId(int IdServicio);
}
