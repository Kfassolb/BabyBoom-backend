package com.babyboom.services;

import com.babyboom.entities.Soportetecnico;

import java.util.List;

public interface ISoportetecnicoService {

    public void insert(Soportetecnico soportetecnico);

    List<Soportetecnico> list();

    public void delete(int idSoportetecnico);

    public Soportetecnico listId(int IdSoportetecnico);
}