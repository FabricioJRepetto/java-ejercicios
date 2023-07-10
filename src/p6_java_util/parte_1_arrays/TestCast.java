package p6_java_util.parte_1_arrays;

import p5_java_lang.arg.com.bytebank.modelos.*;

public class TestCast {
    public static void main(String[] args) {

        /* Cualquier entero cabe dentro de un double.
           Por eso el compilador se queda quieto y no exige un cast explícito.
           Definir el cast en este caso, sería redundante. */

        int numero = 3;
        double valor = numero; //cast implícito

        /* Ahora bien, lo contrario no funciona sin cast, ya que un double no cabe en un int: */

        double valor2 = 3.56;
        int numero2 = (int) valor; //cast explícito, es exigido por el compilador

        /* En las referencias, se aplica el mismo principio.
           Si el cast siempre funciona no es necesario hacerlo explícito */

        CuentaCorriente cc1 = new CuentaCorriente(22);
        Cuenta cuenta = cc1; //cast implícito

        /* El cast explícito solo funciona si es posible,
           pero hay casos en los que el compilador sabe que un cast es imposible
           y luego ni compila ni con type cast. */

        Cliente cliente = new Cliente();
        // Cuenta cuenta = (Cuenta) cliente; //imposible, no compila
    }
}
