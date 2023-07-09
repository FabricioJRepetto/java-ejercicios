package p5_java_lang.arg.com.bytebank.modelos;

import p5_java_lang.arg.com.bytebank.util.AutenticacionUtil;

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
