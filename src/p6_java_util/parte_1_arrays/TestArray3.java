package p6_java_util.parte_1_arrays;

import p5_java_lang.arg.com.bytebank.modelos.*;

import java.util.ArrayList;
import java.util.List;

public class TestArray3 {
    public static void main(String[] args) {
        /*
            Array generico.
            Es necesario hacer cast para utilizar los métodos de sus elementos.
        */
        Object[] lista = new Object[3];

        lista[0] = new Cliente("FRANCO");
        Cuenta cuenta = new CuentaCorriente(22, 33);
        lista[1] = cuenta;

        Cliente c = (Cliente) lista[0];
        Cuenta cc = (CuentaCorriente) lista[1];

        System.out.println(c.getNombre());
        System.out.println(cc.getAgencia());
    }
}
