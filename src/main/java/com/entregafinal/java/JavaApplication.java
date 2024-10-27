package com.entregafinal.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entregafinal.java.dto.ProductoDTO;
import com.entregafinal.java.service.ProductoServiceImpl;

@SpringBootApplication
public class JavaApplication implements CommandLineRunner {

    @Autowired
    ProductoServiceImpl productoService;

    public static void main(String[] args) {
        SpringApplication.run(JavaApplication.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mostrando Productos:");

        for (ProductoDTO p : productoService.getAllProductos()) {
            System.out.println(p);
        }
    }
}
