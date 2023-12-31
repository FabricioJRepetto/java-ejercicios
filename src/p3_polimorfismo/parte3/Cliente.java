package p3_polimorfismo.parte3;

import p3_polimorfismo.parte4.AutenticacionUtil;

import java.util.Objects;

public class Cliente implements Autenticable {
    private String nombre;
    private String documento;
    private String telefono;

    // El acoplamiento de objetos sirve para facilitar la reutilización de código
    // En este caso la clase util aisla toda la lóica de los métodos de autenticación
    private AutenticacionUtil util;

    public Cliente() {
        this.util = new AutenticacionUtil();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
