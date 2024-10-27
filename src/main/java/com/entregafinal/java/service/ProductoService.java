package com.entregafinal.java.service;

import com.entregafinal.java.dto.ProductoDTO;
import com.entregafinal.java.dto.UserDTO;

import java.util.List;

public interface ProductoService {
    List<ProductoDTO> getAllProductos();

    ProductoDTO getProductoById(Long id);

    ProductoDTO saveProducto(ProductoDTO productoDTO);

    void deleteProducto(Long id);

    void validarStock(List<ProductoDTO> productosDTO);

    void reducirStock(List<ProductoDTO> productosDTO);

    List<UserDTO> getUsersFromExternalApi();

    List<UserDTO> getUsersFromExternalApiUsingHttpClient();
}