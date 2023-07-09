package p5_java_lang.arg.com.bytebank.test;

import p5_java_lang.arg.com.bytebank.modelos.*;

public class TestCuentas {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente();
            cliente.setNombre("Fabricio Repetto");

            CuentaCorriente cc = new CuentaCorriente(12);
            CuentaAhorros ca = new CuentaAhorros(15);
            cc.setTitular(cliente);

            cc.depositar(1000);
            cc.transferir(500, ca); // Lanza excepción

            System.out.println(cc.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
