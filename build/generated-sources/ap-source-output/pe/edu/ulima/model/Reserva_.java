package pe.edu.ulima.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pe.edu.ulima.model.Cliente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-04T05:43:00")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, Cliente> id_cliente;
    public static volatile SingularAttribute<Reserva, Integer> ano;
    public static volatile SingularAttribute<Reserva, Integer> pax;
    public static volatile SingularAttribute<Reserva, String> hora;
    public static volatile SingularAttribute<Reserva, Integer> id_reserva;
    public static volatile SingularAttribute<Reserva, String> mes;
    public static volatile SingularAttribute<Reserva, String> comentario;
    public static volatile SingularAttribute<Reserva, Integer> dia;

}