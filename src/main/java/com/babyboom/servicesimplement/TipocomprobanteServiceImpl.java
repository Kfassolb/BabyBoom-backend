package com.babyboom.servicesimplement;

import com.babyboom.entities.Tipocomprobante;
import com.babyboom.repositories.ITipocomprobanteRepository;
import com.babyboom.services.ITipocomprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipocomprobanteServiceImpl implements ITipocomprobanteService {
    @Autowired
    private ITipocomprobanteRepository tcR;

    @Override
    public void insert(Tipocomprobante tipocomprobante) {
    tcR.save(tipocomprobante);
    }

    @Override
    public List<Tipocomprobante> list() {
        return tcR.findAll();
    }

    @Override
    public void delete(int idTipocomprobante) {
        tcR.deleteById(idTipocomprobante);
    }

    @Override
    public Tipocomprobante listId(int idTipocomprobante) {
        return tcR.findById(idTipocomprobante).orElse(new Tipocomprobante());
    }
}
