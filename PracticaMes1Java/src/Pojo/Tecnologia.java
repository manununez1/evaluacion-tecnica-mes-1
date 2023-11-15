package Pojo;

public class Tecnologia {
    private String nombre;
    private int id;

    public Tecnologia(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public boolean esIdPar() {
        try {
            int id = Integer.parseInt(nombre.split("-")[0]);
            return id % 2 == 0;
        } catch (NumberFormatException e) {
            return false; // Manejo de errores si el ID no es un número válido
        }
    }
}
