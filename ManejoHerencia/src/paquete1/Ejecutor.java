/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int opcion;
        boolean bandera = true;
        String listaAutos = "";
        String listaEducativa = "";

        do {
            opcion = menu();

            if (opcion == 1) {
                mostrarListas(listaAutos, listaEducativa);
                mostrarListas(listaAutos, listaEducativa);
                menu();
            } else {
                if (opcion == 2 || opcion == 3) {
                    System.out.println("\t\tDATOS BENEFICIARIO");
                    System.out.print("Ingrese nombres: ");
                    String nombre = entry.nextLine();
                    System.out.print("Ingrese apellidos: ");
                    String apellido = entry.nextLine();
                    System.out.print("Ingrese Cedula: ");
                    String cedula = entry.nextLine();
                    System.out.print("Ingrese username: ");
                    String userName = entry.nextLine();
                    Persona p = new Persona(nombre, apellido, cedula, userName);
                    switch (opcion) {
                        case 2:
                            listaAutos = String.format("%s\n%s\n%s\n",
                                    listaAutos,
                                    p,
                                    nuevoPrestamoAutomovil(p));
                            break;
                        case 3:
                            listaEducativa = String.format("%s\n%s\n%s\n",
                                    listaEducativa,
                                    p,
                                    nuevoPrestamosEducativo(p));
                            break;

                    }
                } else {
                    System.out.println("Programa finalizado Con Exito");
                    bandera = false;
                    break;
                }
            }
        } while (bandera);
    }

    public static int menu() {
        Scanner entry = new Scanner(System.in);
        int opcion;
        System.out.println("\t\tMenu Principal");
        System.out.println("Mostrar Listas:                              [1]");
        System.out.println("Crear un Prestamo de tipo Automovil:         [2]");
        System.out.println("Crear un Prestamo de tipo Educativo:         [3]");
        System.out.println("Finalizar Programa:                          [4]");
        opcion = entry.nextInt();
        if (opcion < 1 || opcion > 4) {
            do {
                System.out.println("El valor esta fuera de los parametros, "
                        + "ingrese otro valor");
                opcion = entry.nextInt();
            } while (opcion < 1 || opcion > 4);
        }
        return opcion;

    }

    public static String nuevoPrestamoAutomovil(Persona p) {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        System.out.println("------------------------------------------------");
        System.out.println("\t\tDATOS GARANTE");
        System.out.print("Ingrese nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese apellido:");
        String apellido = entrada.nextLine();
        System.out.print("Ingrese cedula:");
        String cedula = entrada.nextLine();
        System.out.print("Ingrese username:");
        String userName = entrada.nextLine();
        Persona garante = new Persona(nombre, apellido, cedula, userName);

        System.out.println("------------------------------------------------");
        System.out.println("Ingrese el numero de meses");
        int numMeses = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese ciudad");
        String ciudad = entrada.nextLine();

        System.out.println("------------------------------------------------");
        System.out.println("Ingrese El Tipo De Automovil");
        String tipo = entrada.nextLine();
        System.out.println("Ingrese La Marca Del Automovil");
        String marca = entrada.nextLine();
        System.out.println("Ingrese El Valor Del Automovil");
        double valor = entrada.nextInt();

        PrestamoAutomovil preAuto = new PrestamoAutomovil(p, garante, numMeses,
                ciudad, tipo, marca, valor);
        preAuto.calcularCostoMensual();
        System.out.println("------------------------------------------------");
        cadena = String.format("Datos beneficiario%s\n%s\n"
                + "hola ecuador", cadena, preAuto);
        return cadena;

    }

    public static String nuevoPrestamosEducativo(Persona p) {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        System.out.println("------------------------------------------------");
        System.out.println("\t\tDATOS PRESTAMO EDUCATIVO");
        System.out.print("Ingrese nombre institucion: ");
        String nombre2 = entrada.nextLine();
        System.out.print("Ingrese las siglas: ");
        String siglas = entrada.nextLine();

        InstitucionEducativa i = new InstitucionEducativa(nombre2, siglas);
        System.out.println("------------------------------------------------");

        System.out.print("Ingrese numero de meses ");
        int numMeses = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese ciudad del prestamo");
        String ciudad = entrada.nextLine();

        System.out.println("------------------------------------------------");

        System.out.print("Ingrese el nivel de estudio: ");
        String nivel = entrada.nextLine();
        System.out.print("Ingrese el valor de la carrera: ");
        double valor = entrada.nextDouble();

        PrestamoEducativo preEdu = new PrestamoEducativo(p, numMeses, ciudad,
                i, nivel, valor);
        preEdu.calcularValorMensual();
        System.out.println("------------------------------------------------");
        cadena = String.format("%s\n%s\n", cadena, preEdu);
        return cadena;
    }

    public static void mostrarListas(String listaAutos, String listaEducativa) {
        Scanner entry = new Scanner(System.in);

        System.out.println("\t\tLISTAS");
        System.out.println("Prestamos Automoviles:      [1]");
        System.out.println("Prestamos Educativos:       [2]");
        System.out.println("Menu Principal:             [3]");
        int opcion = entry.nextInt();
        if (opcion < 1 || opcion > 3) {
            do {
                System.out.println("El valor esta fuera de los parametros\n"
                        + "ingrese valores correctos");
                opcion = entry.nextInt();
            } while (opcion < 1 || opcion > 2);
        }

        if (opcion == 1) {
            System.out.println(listaAutos);

        } else {
            if (opcion == 2) {
                System.out.println(listaEducativa);
            }else{
                if(opcion==3){
                    menu();
                }
            }

        }
    }
}
