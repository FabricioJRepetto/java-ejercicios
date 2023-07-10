package p6_java_util.parte_1_arrays;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int edad1 = 18;
        int edad2 = 20;
        int edad3 = 28;

        // Para crear un array necesitamos indicar la candidad de pociciones.
        int[] edades = new int[5];
        // Para Guardar un valor, utilizamos el índice.
        edades[2] = 34;

        System.out.println(edades[1]);
        System.out.println(edades[2]);

        // for (int i = 0; i < edades.length; i++) {
        //     System.out.println(edades[i]);
        // }

        // foreach
        for (int edad : edades) {
            System.out.println(edad);
        }
    }
}
