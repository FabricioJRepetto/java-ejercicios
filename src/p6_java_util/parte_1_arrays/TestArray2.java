package p6_java_util.parte_1_arrays;

import p5_java_lang.arg.com.bytebank.modelos.CuentaCorriente;

public class TestArray2 {
    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente(113);
        CuentaCorriente[] cuentas = new CuentaCorriente[5];

        // Guardamos la REFERENCIA
        cuentas[0] = cc;

        // Guardamos el OBJETO
        cuentas[1] = new CuentaCorriente(29);

        System.out.println(cuentas[0]);
        System.out.println(cuentas[1]);
    }
}
