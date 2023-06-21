package com.babyboom.repositories;


import com.babyboom.entities.Compraproducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompraproductoRepository extends JpaRepository <Compraproducto, Integer> {
}
