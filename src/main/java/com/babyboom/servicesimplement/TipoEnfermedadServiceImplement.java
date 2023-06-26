package com.babyboom.servicesimplement;
import com.babyboom.dtos.ReporteEnfermedadBebeDTO;
import com.babyboom.dtos.ReporteEnfermedadDTO;
import com.babyboom.entities.Bebe;
import com.babyboom.entities.TipoEnfermedad;
import com.babyboom.repositories.ITipoEnfermedadRepository;
import com.babyboom.services.ITipoEnfermedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TipoEnfermedadServiceImplement implements ITipoEnfermedadService {
    @Autowired
    private ITipoEnfermedadRepository pR;
    @Override
    public void insert(TipoEnfermedad tipoEnfermedad){pR.save(tipoEnfermedad);}
    @Override
    public List <TipoEnfermedad> list(){return pR.findAll();}

    public void delete(int idTipoEnfermedad){
        pR.deleteById(idTipoEnfermedad);
    }

    public TipoEnfermedad listId(int IdTipoEnfermedad){
        return pR.findById(IdTipoEnfermedad).orElse(new TipoEnfermedad());
    }

    @Override
    public List<ReporteEnfermedadDTO> findByTipoTipoEnfermedad(String tipoTipoEnfermedad) {
        List<String[]> getEnefermedadbyTipo = pR.findByTipoTipoEnfermedad(tipoTipoEnfermedad);
        List<ReporteEnfermedadDTO> reporteEnfermedadDTO = new ArrayList<>();

        for (String[] data : getEnefermedadbyTipo) {
            ReporteEnfermedadDTO dto = new ReporteEnfermedadDTO();
            dto.setNombre_tipo_enfermedad(data[0]);
            dto.setTipo_tipo_enfermedad(String.valueOf(Integer.parseInt(data[1])));
            reporteEnfermedadDTO.add(dto);
        }

        return reporteEnfermedadDTO;
    }


    @Override
    public List<ReporteEnfermedadBebeDTO> findBebesConEnfermedad(String nombreTipoEnfermedad) {
        List<String[]> getBebebyNombreEnfermedad = pR.findByTipoTipoEnfermedad(nombreTipoEnfermedad);
        List<ReporteEnfermedadBebeDTO> reporteenfermedadbebeDTO = new ArrayList<>();

        for (String[] data : getBebebyNombreEnfermedad) {
            ReporteEnfermedadBebeDTO dto = new ReporteEnfermedadBebeDTO();
            dto.setNombre_tipo_enfermedad(data[0]);
            dto.setNombre_tipo_enfermedad(String.valueOf(Integer.parseInt(data[1])));
            reporteenfermedadbebeDTO.add(dto);
        }

        return reporteenfermedadbebeDTO;
    }



}
