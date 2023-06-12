package com.babyboom.services;

import com.babyboom.entities.Medico;

import java.util.List;

public interface IMedicoService {
    public void insert(Medico medico);
    List<Medico>list();
    public void delete(int idMedico);
    public Medico listId(int idMedico);
}
