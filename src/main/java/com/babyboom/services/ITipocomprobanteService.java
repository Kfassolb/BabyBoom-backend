package com.babyboom.services;

import com.babyboom.entities.Tipocomprobante;

import java.util.List;

public interface ITipocomprobanteService {

    public void insert(Tipocomprobante tipocomprobante);
    List<Tipocomprobante>list();

    public void delete(int idTipocomprobante);
    public Tipocomprobante listId(int idTipocomprobante);
}
