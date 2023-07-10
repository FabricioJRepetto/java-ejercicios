package p6_java_util.parte_3_ArrayList_Generics;

import p5_java_lang.arg.com.bytebank.modelos.CuentaCorriente;

public class TestGuardaCuenta {
    public static void main(String[] args) {

        GuardaCuentas gc = new GuardaCuentas();
        CuentaCorriente cc = new CuentaCorriente(22);

        gc.adicionar(cc);
        System.out.println(gc.obtener(0));
    }
}
