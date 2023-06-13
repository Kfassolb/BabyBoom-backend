package com.babyboom.repositories;

import com.babyboom.entities.TipoEnfermedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITipoEnfermedadRepository extends JpaRepository <TipoEnfermedad,Integer> {
@Query("from TipoEnfermedad e where e.tipoTipoEnfermedad=:tipoTipoEnfermedad")
    List<TipoEnfermedad>findByTipoTipoEnfermedad(@Param("tipoTipoEnfermedad")String tipoTipoEnfermedad);

}
