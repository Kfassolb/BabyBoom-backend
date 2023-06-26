package com.babyboom.servicesimplement;

import com.babyboom.dtos.PublicacionComunidadDTO;
import com.babyboom.entities.Comunidad;
import com.babyboom.entities.Publicacion;
import com.babyboom.repositories.IPublicacionRepository;
import com.babyboom.services.IPublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublicacionServicesImplement implements IPublicacionService {
    @Autowired
    private IPublicacionRepository pR;

    @Override
    public void insert(Publicacion publicacion) {
pR.save(publicacion);
    }

    @Override
    public List<Publicacion> list() {
        return pR.findAll();
    }

    @Override
    public List<PublicacionComunidadDTO> reporte01() {
        List<String[]> ComunidadCountBytitulo = pR.getcomunidadCountBytitulo();
        List<PublicacionComunidadDTO> publicacionComunidadDTOS = new ArrayList<>();

        for (String[] data :ComunidadCountBytitulo ) {
            PublicacionComunidadDTO dto = new PublicacionComunidadDTO();
            dto.setPublicacionName(data[0]);
            dto.setComunidadCount(Integer.parseInt(data[1]));
            publicacionComunidadDTOS.add(dto);
        }
        return publicacionComunidadDTOS;
    }

}
