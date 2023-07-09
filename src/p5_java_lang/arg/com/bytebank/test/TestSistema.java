package p5_java_lang.arg.com.bytebank.test;

import p5_java_lang.arg.com.bytebank.modelos.*;

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
