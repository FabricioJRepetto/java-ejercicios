package p3_polimorfismo.parte2;

import p3_polimorfismo.parte2.Cuenta;
import p3_polimorfismo.parte2.Cliente;

public class TestReferencia {
    public static void main(String[] args) {
        Cliente fabricio = new Cliente();
        fabricio.setNombre("Fabricio Repetto");
        fabricio.setDocumento("36000000");
        fabricio.setTelefono("1158722352");

        Cuenta cuentaFabricio = new Cuenta(5);
        cuentaFabricio.setTitular(fabricio);
    }
}
