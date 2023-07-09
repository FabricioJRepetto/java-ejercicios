package p3_polimorfismo.parte3;

import p3_polimorfismo.parte4.AutenticacionUtil;

import java.util.Objects;

public class Administrador extends Funcionario implements Autenticable {
    private AutenticacionUtil util;

    public Administrador() {
        this.util = new AutenticacionUtil();
    }

    @Override
    public double getBonificacion() {
        return super.getSalario() * 0.5;
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
