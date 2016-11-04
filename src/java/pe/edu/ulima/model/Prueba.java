package pe.edu.ulima.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Prueba {

    public static void main(String[] args) {

        //Agregar Categoría:
        Categoria cat1 = new Categoria();
        Categoria cat2 = new Categoria();

        cat1.setNombre("Vinos");
        cat2.setNombre("Postres");

        //Agregar Proveedor:
        Proveedor prov1 = new Proveedor();
        Proveedor prov2 = new Proveedor();

        prov1.setNombre("PeruFarma");
        prov2.setNombre("Backus");

        //Agregando Producto:
        Producto prod1 = new Producto();
        Producto prod2 = new Producto();

        
        
        prod1.setId_categoria(cat1);
        prod1.setId_proveedor(prov1);
        prod1.setNombre("Navarro Correas");
        prod1.setPrecio(60.0f);
        prod1.setEstado("Activo");
        prod1.setPreparacion("A continuación mostraremos la preparación de este vino...");

        prod2.setId_categoria(cat2);
        prod2.setId_proveedor(prov2);
        prod2.setNombre("Picarones");
        prod2.setPrecio(8.0f);
        prod2.setEstado("Inactivo");
        prod2.setPreparacion("A continuación mostraremos la preparación de este postre...");

        //Creando Usuarios:
        Usuario usuario1 = new Usuario(1, "jcuro", "123456", "Juan Carlos", "Curo Choque", "123456789", "jcuro@gmail.com", 10);
        Usuario usuario2 = new Usuario(2, "aalfaro", "654321", "Antonio", "Alfaro", "123456789", "aalfaro@gmail.com", 10);

        Personal perso1 = new Personal();
        Personal perso2 = new Personal();
        
        perso1.setId_personal(1);
        perso1.setNombres("Juan Perez");
        perso1.setTelefono(123456789);
        perso1.setDni(12345678);
        perso1.setCorreo("jperez@gmail.com");
        perso1.setCargo("Mozo");
        
        perso2.setId_personal(2);
        perso2.setNombres("Juan Salas");
        perso2.setTelefono(987654321);
        perso2.setDni(12345678);
        perso2.setCorreo("jsalas@hotmail.com");
        perso2.setCargo("Administrador");
        
        Venta ventita1 = new Venta();
        Venta ventita2 = new Venta();
        
        ventita1.setId_venta(1);
        ventita1.setId_personal(perso1);
        ventita1.setPax(2);
        ventita1.setMontoPagar(10.5f);
        
        ventita2.setId_venta(2);
        ventita2.setId_personal(perso2);
        ventita2.setPax(5);
        ventita2.setMontoPagar(16.5f);
        
        DetalleVenta detallito1 = new DetalleVenta();
        
        detallito1.setId_venta(ventita1);
        detallito1.setDescripcion("Mesa 1");
        detallito1.setId_producto(prod1);
        detallito1.setId_venta(ventita1);
        detallito1.setCantidad(3);
        detallito1.setPrecioT(30.5f);
        
                
        //Creando Objeto DAO:
        GestionDAO daito = new GestionDAO();

        daito.conectarse();
        daito.registrarCategoria(cat1);
        daito.registrarProveedor(prov1);
        daito.registrarProducto(prod1);
        daito.registrarUsuario(usuario1);
        daito.registrarCategoria(cat2);
        daito.registrarProveedor(prov2);
        daito.registrarProducto(prod2);
        daito.registrarUsuario(usuario2);
        daito.desconectarse();

    }
}
