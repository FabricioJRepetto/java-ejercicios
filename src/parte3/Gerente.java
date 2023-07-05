package parte3;

import java.util.Objects;

public class Gerente extends Funcionario implements Autenticable {
    private String clave;

    // Sobreescritura/Override de metodo
    @Override
    public double getBonificacion() {
        System.out.print("+100% ");
        return super.getSalario() * 1.1;
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
