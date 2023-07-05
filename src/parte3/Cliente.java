package parte3;

import java.util.Objects;

public class Cliente implements Autenticable {
    private String nombre;
    private String documento;
    private String telefono;
    private String clave;

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return Objects.equals(clave, this.clave);
    }
}
