package p3_polimorfismo.parte3;

public interface Autenticable {
    void setClave(String clave);

    boolean iniciarSesion(String clave);
}
