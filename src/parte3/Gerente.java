package parte3;

import java.util.Objects;

public class Gerente extends Funcionario {
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) {
        return Objects.equals(clave, this.clave);
    }

    // Sobreescritura/Override de metodo
    @Override
    public double getBonificacion() {
        System.out.print("+100% ");
        return super.getSalario() * 1.1;
    }
}
