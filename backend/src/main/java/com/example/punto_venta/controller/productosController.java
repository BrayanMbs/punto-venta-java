package com.example.punto_venta.controller;


import com.example.punto_venta.entity.productos;
import com.example.punto_venta.service.productosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class productosController {

    private final productosService productosService;

    public productosController(productosService productosService) {
        this.productosService = productosService;
    }

    @GetMapping
    public List<productos> listarProductos() {
        return productosService.getAllProductos();
    }

    @PostMapping
    public productos crearProducto(@RequestBody productos producto) {
        return productosService.saveProducto(producto);
    }
}

