package p3_polimorfismo.parte2;

import p3_polimorfismo.parte2.Cuenta;
public class TestMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(10);
        miCuenta.depositar(300);

        Cuenta cuentaJimena = new Cuenta(15);
        cuentaJimena.depositar(1000);

        boolean resultado = cuentaJimena.transferir(400, miCuenta);

        if (resultado) {
            System.out.println("Transferencia exitosa.");
            System.out.println(cuentaJimena.getSaldo());
            System.out.println(miCuenta.getSaldo());
        } else {
            System.out.println("Error en la transferencia.");
        }

        // Metodo estático de la clase
        System.out.println("Cuentas creadas: " + Cuenta.getContador());

    }
}
