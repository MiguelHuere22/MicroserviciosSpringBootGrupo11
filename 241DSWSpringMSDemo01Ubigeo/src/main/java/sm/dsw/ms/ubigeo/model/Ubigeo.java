package sm.dsw.ms.ubigeo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Ubigeo")
public class Ubigeo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ubigeo")
    private Long idUbigeo;

    private String departamento;
    private String provincia;
    private String distrito;
    private Double superficie;
    private Double altitud;
    private Double latitud;
    private Double longitud;

    // Getters y Setters
    public Long getIdUbigeo() {
        return idUbigeo;
    }

    public void setIdUbigeo(Long idUbigeo) {
        this.idUbigeo = idUbigeo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public Double getAltitud() {
        return altitud;
    }

    public void setAltitud(Double altitud) {
        this.altitud = altitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }
}
