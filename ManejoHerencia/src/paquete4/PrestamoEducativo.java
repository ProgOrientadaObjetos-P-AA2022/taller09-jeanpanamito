/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;
/**
 *
 * @author reroes
 */
public class PrestamoEducativo  extends Prestamo{
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensual;

   public PrestamoEducativo(Persona p, int t, String ciud, 
            InstitucionEducativa i, String nivEstu, double valor) {
        super(p, t, ciud);
        centroEducativo = i;
        nivelEstudio = nivEstu;
        valorCarrera = valor;

    }

   
   

    public void establecerCiudad(String ciu) {
        ciudadPrestamo = ciu.toUpperCase();
    }

    public void establecerNivelEstudio(String n) {
        nivelEstudio = n;
    }

    public void establecerCentroEducativo(InstitucionEducativa i) {
        centroEducativo = i;
    }

    public void establecerValorCarrera(double val) {
        valorCarrera = val;
    }

    public void calcularValorMensual() {
        double aux;
        aux = (valorCarrera / tiempoPrestamo);
        valorMensual = (10 * aux) / 100;
        valorMensual = aux - valorMensual;
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerInstitucionEducativa() {
        return centroEducativo;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {

        String cadenaFinal = String.format(
                "Nombre: %s\n"
                + "Siglas: %s\n"
                + "Tiempo Prestamos: %d\n"
                + "Ciudad Del Prestamo: %s\n"
                + "Nivel De Estudio: %s\n"
                + "Valor De La Carrera: %s\n"
                + "Valor Mensual: %.2f\n",
                centroEducativo.obtenerNombreInstitucion(),
                centroEducativo.obtenerSiglasInstitucion(),
                tiempoPrestamo,
                ciudadPrestamo,
                nivelEstudio,
                valorCarrera,
                valorMensual);

        return cadenaFinal;
    }
}
