
package pe.edu.ulima.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id_venta;
    @ManyToOne
    private Personal id_personal;
    @Column
    private int pax;
    @Column
    private Float montoPagar;
    @Column
    private String mesa;

    public Venta(int id_venta, Personal id_personal, int pax, Float montoPagar, String mesa) {
        this.id_venta = id_venta;
        this.id_personal = id_personal;
        this.pax = pax;
        this.montoPagar = montoPagar;
        this.mesa = mesa;
    }

    
    public Venta() {
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public Personal getId_personal() {
        return id_personal;
    }

    public void setId_personal(Personal id_personal) {
        this.id_personal = id_personal;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public Float getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(Float montoPagar) {
        this.montoPagar = montoPagar;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    
    
    
}
