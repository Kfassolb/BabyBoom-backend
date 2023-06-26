package com.babyboom.services;

import com.babyboom.dtos.Reportellb1DTO;
import com.babyboom.dtos.Reportellb2DTO;
import com.babyboom.entities.Apoderado;
import com.babyboom.entities.Citamedica;

import java.util.List;

public interface ICitamedicaService {
    public void insert(Citamedica citamedica);
    List<Citamedica> list();
    public void delete(int idCita);
    public Citamedica listId(int idCita);
    public List<Reportellb1DTO> reportellb1();
    public List<Reportellb2DTO> reportellb2(String nombre);
}
