package parte4;

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
