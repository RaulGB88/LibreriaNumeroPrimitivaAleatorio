/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

import java.util.Random;

/**
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class NumeroPrimitiva {

    //Instanciación del método Random.
    public static final Random RND = new Random(System.currentTimeMillis());
    //Instanciación del Array que contiene los números que forman el boleto de la Primitiva.
    public static int[] numeroPapeleta = new int[5];

    //Obtiene un número aleatorio.
    public static int obtenerNumero(int n1, int n2) {

        int numero = RND.nextInt(n1 - n2 + 1) + n2;

        return numero;
    }

    //Repite el método anterior y lo almacena.
    public static void repetirNumero(int n1, int n2, int vecesMax) {

        for (int veces = 0; veces < vecesMax; veces++) {

            numeroPapeleta[veces] = obtenerNumero(n1, n2);
            //System.out.println(numeroPapeleta[veces]);
        }
    }

    //Mensaje con el número completo del boleto de Primitiva.
    public static void mensajePrimitiva(int n1, int n2, int vecesMax) {

        repetirNumero(n1, n2, vecesMax);
        System.out.printf("Numero de la Primitiva....: %d-%d-%d-%d-%d", numeroPapeleta[0], numeroPapeleta[1], numeroPapeleta[2], numeroPapeleta[3], numeroPapeleta[4]);
    }

}
