package com.babyboom.repositories;

import com.babyboom.entities.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompraRepository extends JpaRepository<Compra,Integer> {
}
