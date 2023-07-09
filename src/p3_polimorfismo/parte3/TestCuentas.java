package p3_polimorfismo.parte3;

import p3_polimorfismo.parte3.CuentaAhorros;
import p3_polimorfismo.parte3.CuentaCorriente;

public class TestCuentas {
    public static void main(String[] args) {
        try {
            CuentaCorriente cc = new CuentaCorriente(12);
            CuentaAhorros ca = new CuentaAhorros(15);

            cc.depositar(1000);
            cc.transferir(1500, ca); // Lanza excepción

            System.out.println(cc.getSaldo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
