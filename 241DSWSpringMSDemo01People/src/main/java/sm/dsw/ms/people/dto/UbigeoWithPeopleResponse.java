package sm.dsw.ms.people.dto;

import sm.dsw.ms.people.model.People;
import java.util.List;

public class UbigeoWithPeopleResponse {
    private String departamento;
    private String provincia;
    private String distrito;
    private List<People> personas;

    // Getters y Setters
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

    public List<People> getPersonas() {
        return personas;
    }

    public void setPersonas(List<People> personas) {
        this.personas = personas;
    }
}
