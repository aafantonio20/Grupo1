
package pe.edu.ulima.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto {
    //Atributos:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id_producto;
    @ManyToOne
    private Categoria id_categoria;
    @ManyToOne
    private Proveedor id_proveedor;
    @Column
    private String nombre;
    @Column
    private float precio;
    @Column
    private String estado;
    @Column
    private String preparacion;
    
    //Constructores:
    //Con parámetros:
    public Producto(int id_producto, Categoria id_categoria, Proveedor id_proveedor, String nombre, float precio, String estado, String preparacion) {
        this.id_producto = id_producto;
        this.id_categoria = id_categoria;
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
        this.preparacion = preparacion;
    }
       
    //Sin parámetros:
    public Producto() {
    }
    
    //Getter and setter:
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public Categoria getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Categoria id_categoria) {
        this.id_categoria = id_categoria;
    }

    public Proveedor getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Proveedor id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
