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
public class InstitucionEducativa {
     protected String nombreInstitucion;
    protected String siglasInstitucion;

    public InstitucionEducativa(String n, String s) {

        nombreInstitucion = n;
        siglasInstitucion = s;

    }

    public void establecerNombreInstitucion(String nom) {
        nombreInstitucion = nom;
    }

    public void establecerSiglasInstitucion(String sig) {
        siglasInstitucion = sig;
    }

    public String obtenerNombreInstitucion() {
        return nombreInstitucion;
    }

    public String obtenerSiglasInstitucion() {
        return siglasInstitucion;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Siglas: %s\n",
                nombreInstitucion,
                siglasInstitucion);

        return cadena;
    }
}
