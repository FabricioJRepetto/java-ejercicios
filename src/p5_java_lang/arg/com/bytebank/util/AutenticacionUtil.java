package p5_java_lang.arg.com.bytebank.util;

import java.util.Objects;

public class AutenticacionUtil {
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) {
        return Objects.equals(this.clave, clave);
    }

}
