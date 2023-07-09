package p3_polimorfismo.parte1;

public class Factoriales {
    public static void main(String[] args) {
//        multiplos de 3
//        for (int numero = 1; numero <= 100; numero++) {
//            if (numero% 3 == 0) {
//                System.out.println(numero);
//            }
//        }

//        factoriales
        int num = 6;
        int result = num;

        for (int i = num; i > 1 ; i--) {
            result = result * (i - 1);
        }
        System.out.println(result);
    }
}
