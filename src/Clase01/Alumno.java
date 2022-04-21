package Clase01;

import java.util.Date;

public class Alumno {
    public Alumno() {
        nombre = "Hola Mundo!";
    }

    int numeroDocumento;
    String nombre;
    String apellido;
    Date fechaNacimiento;
    boolean activo;

    public void imprimirAtributos() {
        System.out.println(numeroDocumento + " " + nombre);
    }

    public void activar() {
        activo = true;
    }

    public void desactivar() {
        activo = false;
    }

    public String nombreMayuscula() {
        return nombre.toUpperCase();
    }
}
