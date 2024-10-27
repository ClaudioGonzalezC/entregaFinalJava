package com.entregafinal.desafiojava.repository;

import com.entregafinal.desafiojava.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
