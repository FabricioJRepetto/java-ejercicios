package parte3;

import java.util.Objects;

public interface Autenticable {
    void setClave(String clave);

    boolean iniciarSesion(String clave);
}
