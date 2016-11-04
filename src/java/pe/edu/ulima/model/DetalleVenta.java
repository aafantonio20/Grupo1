
package pe.edu.ulima.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DetalleVenta")
public class DetalleVenta {
    //Atributos:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id_detalleventa;
    @ManyToOne
    private Producto id_producto;
    @ManyToOne
    private Venta id_venta;
    @Column
    private String descripcion;
    @Column
    private int cantidad;
    @Column
    private float precioT;

    public DetalleVenta(int id_detalleventa, Producto id_producto, Venta id_venta, String descripcion, int cantidad, float precioT) {
        this.id_detalleventa = id_detalleventa;
        this.id_producto = id_producto;
        this.id_venta = id_venta;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioT = precioT;
    }

       
    public DetalleVenta() {
    }

    public int getId_detalleventa() {
        return id_detalleventa;
    }

    public void setId_detalleventa(int id_detalleventa) {
        this.id_detalleventa = id_detalleventa;
    }

    public Producto getId_producto() {
        return id_producto;
    }

    public void setId_producto(Producto id_producto) {
        this.id_producto = id_producto;
    }

    public Venta getId_venta() {
        return id_venta;
    }

    public void setId_venta(Venta id_venta) {
        this.id_venta = id_venta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioT() {
        return precioT;
    }

    public void setPrecioT(float precioT) {
        this.precioT = precioT;
    }

   
    
    
}
