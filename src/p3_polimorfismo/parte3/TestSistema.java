package p3_polimorfismo.parte3;

import p3_polimorfismo.parte3.Gerente;
import p3_polimorfismo.parte3.Cliente;

public class TestSistema {
    public static void main(String[] args) {
        Gerente ge = new Gerente();
        Cliente cl = new Cliente();

        ge.setClave("1234");
        cl.setClave("1234");

        SistemaInterno si = new SistemaInterno();

        si.autenticar(ge);
        si.autenticar(cl);
    }
}
