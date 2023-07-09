package p5_java_lang.arg.com.bytebank.modelos;

public interface Autenticable {
    void setClave(String clave);

    boolean iniciarSesion(String clave);
}
