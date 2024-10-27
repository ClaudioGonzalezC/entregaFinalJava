package com.entregafinal.java.repository;

import com.entregafinal.java.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
