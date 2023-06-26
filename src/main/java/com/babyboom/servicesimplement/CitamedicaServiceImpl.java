package com.babyboom.servicesimplement;

import com.babyboom.dtos.Reportellb1DTO;
import com.babyboom.dtos.Reportellb2DTO;
import com.babyboom.entities.Citamedica;
import com.babyboom.repositories.ICitamedicaRepository;
import com.babyboom.services.ICitamedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CitamedicaServiceImpl implements ICitamedicaService {
    @Autowired
    private ICitamedicaRepository citamedicaR;

    @Override
    public void insert(Citamedica citamedica) {
        citamedicaR.save(citamedica);
    }

    @Override
    public List<Citamedica> list() {
        return citamedicaR.findAll();
    }

    @Override
    public void delete(int idCita) {
        citamedicaR.deleteById(idCita);
    }

    @Override
    public Citamedica listId(int idCita) {
        return citamedicaR.findById(idCita).orElse(new Citamedica());
    }

    @Override
    public List<Reportellb1DTO> reportellb1() {
        List<String[]> getCountByplace = citamedicaR.getCountByplace();
        List<Reportellb1DTO> reportellb1DTOS = new ArrayList<>();

        for (String[] data : getCountByplace) {
            Reportellb1DTO dto = new Reportellb1DTO();
            dto.setPlace(data[0]);
            dto.setCount(Integer.parseInt(data[1]));
            reportellb1DTOS.add(dto);
        }

        return reportellb1DTOS;
    }
    @Override
    public List<Reportellb2DTO> reportellb2(String nombre) {
        List<String[]> getCountMedicalAppointment = citamedicaR.getCountMedicalAppointment(nombre);
        List<Reportellb2DTO> reportellb2DTOS = new ArrayList<>();

        for (String[] data : getCountMedicalAppointment) {
            Reportellb2DTO dto = new Reportellb2DTO();
            dto.setNombre(data[0]);
            dto.setCount(Integer.parseInt(data[1]));
            reportellb2DTOS.add(dto);
        }

        return reportellb2DTOS;
    }
}
