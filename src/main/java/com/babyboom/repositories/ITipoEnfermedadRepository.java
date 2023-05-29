package com.babyboom.repositories;

import com.babyboom.entities.TipoEnfermedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoEnfermedadRepository extends JpaRepository <TipoEnfermedad,Integer> {

}
