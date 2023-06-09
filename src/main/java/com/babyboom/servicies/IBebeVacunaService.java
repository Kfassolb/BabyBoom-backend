package com.babyboom.servicies;

import com.babyboom.entities.BebeVacuna;
import com.babyboom.entities.Servicio;

import java.util.List;

public interface IBebeVacunaService {
    public void insert(BebeVacuna bebeVacuna);
    List<BebeVacuna> list();
}
