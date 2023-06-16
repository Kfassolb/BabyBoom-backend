package com.babyboom.repositories;
import com.babyboom.entities.ControlVacunacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IControlVacunacionRepository extends JpaRepository<ControlVacunacion,Integer> {
}
