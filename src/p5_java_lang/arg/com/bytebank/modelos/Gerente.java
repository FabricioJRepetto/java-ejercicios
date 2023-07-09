package p5_java_lang.arg.com.bytebank.modelos;

import p5_java_lang.arg.com.bytebank.util.AutenticacionUtil;

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
