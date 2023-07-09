package parte3;

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
