package Clase01;

import java.util.Date;

public class Alumno {
    public Alumno() {
        nombre = "Hola";
        numeroDocumento = 0;
        apellido = "Mundo";
        fechaNacimiento = new Date();
        activo = false;
    }

    private int numeroDocumento;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private boolean activo;

    public void imprimirAtributos() {
        System.out.println("ATRIBUTOS: [" + numeroDocumento + "] [" + nombre + "]");
    }

    public void activar() {
        activo = true;
    }

    public void desactivar() {
        activo = false;
    }

    public String nombreMayuscula() {
        return (nombre.toUpperCase() + " " + apellido.toUpperCase() + "!");
    }
}
