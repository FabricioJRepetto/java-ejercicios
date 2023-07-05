package parte3;

import java.util.Objects;

public class Administrador extends Funcionario implements Autenticable {
    private String clave;

    @Override
    public double getBonificacion() {
        return 0;
    }

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return Objects.equals(clave, this.clave);
    }
}
