package pe.edu.ulima.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pe.edu.ulima.model.Producto;
import pe.edu.ulima.model.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-04T05:43:00")
@StaticMetamodel(DetalleVenta.class)
public class DetalleVenta_ { 

    public static volatile SingularAttribute<DetalleVenta, String> descripcion;
    public static volatile SingularAttribute<DetalleVenta, Integer> id_detalleventa;
    public static volatile SingularAttribute<DetalleVenta, Producto> id_producto;
    public static volatile SingularAttribute<DetalleVenta, Integer> cantidad;
    public static volatile SingularAttribute<DetalleVenta, Venta> id_venta;
    public static volatile SingularAttribute<DetalleVenta, Float> precioT;

}