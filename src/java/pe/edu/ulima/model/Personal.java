
package pe.edu.ulima.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Personal")
public class Personal {
    
    //Atributos:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id_personal;
    @Column
    private String nombres;
    @Column
    private int dni;
    @Column
    private int telefono;
    @Column
    private String correo;
    @Column
    private String cargo;
    
    //Constructor:
    //Con parámetros:

    public Personal(int id_personal, String nombres, int dni, int telefono, String correo, String cargo) {
        this.id_personal = id_personal;
        this.nombres = nombres;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.cargo = cargo;
    }
   
    
    //Sin parámetros:
    public Personal() {
    }
    
    //Getter and setter:
    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
  
}
