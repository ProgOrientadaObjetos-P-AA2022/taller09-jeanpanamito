/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author JEanpa
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String usernamer;

    public Persona(String n, String ap, String ce, String user) {
        nombre = n;
        apellido = ap;
        cedula = ce;
        usernamer = user;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String ce) {
        cedula = ce;
    }

    public String obtenerUsernamer() {
        return usernamer;
    }

    public void establecerUsernamer(String user) {
        usernamer = user;
    }
     @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Cedula: %s\n"
                + "Username: %s\n",
                nombre,
                apellido,
                cedula,
                usernamer);

        return cadena;
    }

}
