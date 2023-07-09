package p5_java_lang.arg.com.bytebank.modelos;

public class SistemaInterno {
    private String clave = "1234";
    public boolean autenticar(Autenticable autenticable) {
        boolean puedeIniciarSesion = autenticable.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("Error en login");
            return false;
        }
    }
}
