package parte1;

public class Loops {
    public static void main(String[] args) {
        int contador = 0;
        int suma = 0;

//        while (contador < 10) {
//            // contador = contador + 1;
//            // contador += 1;
//            contador++;
//            suma = suma + contador;
//            System.out.println(contador);
//        }

//        for (int i = 1; i <= 10; i++) {
//            suma = suma + i;
//            System.out.println(i);
//        }
//
//        System.out.println("Resultado: " + suma);

        for (int tabla = 0; tabla <= 10; tabla++) {
            for (int multiplo = 0; multiplo <= 10; multiplo++) {
                System.out.print(tabla * multiplo);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
