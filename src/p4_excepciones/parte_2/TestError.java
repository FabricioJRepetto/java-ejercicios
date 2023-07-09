package p4_excepciones.parte_2;

import p3_polimorfismo.parte3.Cuenta;
public class TestError {
    public static void main(String[] args) {
        Cuenta primeraCuenta = null;

        // Error ArithmeticException
        int num = 0;
        double res = 30 / num;
        System.out.println(res);

        // Error NullPointerException
        primeraCuenta.depositar(1000);
        System.out.println(primeraCuenta.getClass());
    }
}
