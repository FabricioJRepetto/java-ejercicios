package p3_polimorfismo.parte3;

import p3_polimorfismo.parte4.AutenticacionUtil;
import java.util.Objects;

public class Gerente extends Funcionario implements Autenticable {
    private AutenticacionUtil util;

    public Gerente() {
        this.util = new AutenticacionUtil();
    }

    // Sobreescritura/Override de metodo
    @Override
    public double getBonificacion() {
        return super.getSalario() * 1.1;
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
