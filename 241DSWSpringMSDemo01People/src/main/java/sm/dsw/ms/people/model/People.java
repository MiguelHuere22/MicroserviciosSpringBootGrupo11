package sm.dsw.ms.people.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Persona")
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Persona")
    private Long idPersona;

    private String apellidos;
    private String nombres;
    private char sexo;
    private String telefono;
    private Date fechaNacimiento;

    private Long idUbigeo; // Relación con Ubigeo por ID

    // Getters y Setters
    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getIdUbigeo() {
        return idUbigeo;
    }

    public void setIdUbigeo(Long idUbigeo) {
        this.idUbigeo = idUbigeo;
    }
}
