package com.entregafinal.java.mapper;

import com.entregafinal.java.dto.ProductoDTO;
import com.entregafinal.java.model.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {

    // Convierte de Producto a ProductoDTO
    public ProductoDTO toDTO(Producto producto) {
        if (producto == null) {
            return null;  // Manejo de null
        }

        return new ProductoDTO(
            producto.getId(),
            producto.getNombre(),
            producto.getPrecioNormal(),
            producto.getPrecioOferta(),
            producto.getDescripcion(),
            producto.getStock()  // Mapeo del stock
        );
    }

    // Convierte de ProductoDTO a Producto
    public Producto toEntity(ProductoDTO dto) {
        if (dto == null) {
            return null;  // Manejo de null
        }

        return new Producto(
            dto.getId(),  // Si necesitas el ID
            dto.getNombre(),
            dto.getPrecio(),  // Aquí se usa el precio normal
            dto.getPrecioOferta(),
            dto.getDescripcion(),
            dto.getCantidad()  // Aquí mapeas la cantidad al stock
        );
    }

    // Método estático para conversión de Producto a ProductoDTO (si lo prefieres)
    public static ProductoDTO fromEntity(Producto producto) {
        if (producto == null) {
            return null;
        }
        return new ProductoDTO(
            producto.getId(),
            producto.getNombre(),
            producto.getPrecioNormal(),
            producto.getPrecioOferta(),
            producto.getDescripcion(),
            producto.getStock()
        );
    }
}
