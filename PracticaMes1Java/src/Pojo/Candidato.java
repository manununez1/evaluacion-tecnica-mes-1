package Pojo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Candidato {
    int id;
    String nombre;
    String apellido;
    double pretensionSalarial;
    int anosExperiencia;
    String tecnologias;


    public Candidato(int id, String nombre, String apellido, double pretensionSalarial, int anosExperiencia, String tecnologias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pretensionSalarial = pretensionSalarial;
        this.anosExperiencia = anosExperiencia;
        this.tecnologias = tecnologias;
    }

    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Pretensión Salarial: " + pretensionSalarial + ", Años de Experiencia: " + anosExperiencia + ", Tecnologías: " + tecnologias;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public int compareTo(Candidato otroCandidato) {
        return Integer.compare(this.id, otroCandidato.id);
    }

    public double getPretensionSalarial() {
        return pretensionSalarial;
    }

    public List<String> ordenarTecnologias() {
        // Dividir la cadena de tecnologías en una lista
        List<String> tecnologiasLista = Arrays.asList(tecnologias.split(",\\s*"));

        // Ordenar la lista de tecnologías alfabéticamente
        List<String> tecnologiasOrdenadas = tecnologiasLista.stream()
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());

        return tecnologiasOrdenadas;
    }

}
