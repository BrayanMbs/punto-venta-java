package com.example.punto_venta.repository;

import com.example.punto_venta.entity.productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<productos, Integer> {
    // Aquí puedes agregar consultas personalizadas si quieres
}
