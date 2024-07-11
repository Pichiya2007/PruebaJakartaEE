package org.luispichiya.webapp.service;

import java.util.List;
import org.luispichiya.webapp.model.Producto;

public interface IProductoService {
    
    public List<Producto> listarProductos();
    
    public void agregarProducto(Producto producto);
    
    public void eliminarProducto(int productoId);
    
    public Producto buscarProductoPorId();
    
    public void editarProducto(Producto producto);
}
