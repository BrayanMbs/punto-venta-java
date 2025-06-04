package com.example.punto_venta.service;

import com.example.punto_venta.entity.productos;
import com.example.punto_venta.repository.ProductosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productosService {

    private final ProductosRepository productosRepository;

    public productosService(ProductosRepository productosRepository) {
        this.productosRepository = productosRepository;
    }

    public List<productos> getAllProductos() {
        return productosRepository.findAll();
    }

    public productos saveProducto(productos producto) {
        return productosRepository.save(producto);
    }
}

