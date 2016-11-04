package pe.edu.ulima.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pe.edu.ulima.model.Categoria;
import pe.edu.ulima.model.Proveedor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-04T05:43:00")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Proveedor> id_proveedor;
    public static volatile SingularAttribute<Producto, Float> precio;
    public static volatile SingularAttribute<Producto, String> estado;
    public static volatile SingularAttribute<Producto, Categoria> id_categoria;
    public static volatile SingularAttribute<Producto, String> preparacion;
    public static volatile SingularAttribute<Producto, Integer> id_producto;
    public static volatile SingularAttribute<Producto, String> nombre;

}