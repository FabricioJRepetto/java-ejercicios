package parte3;

public class Contador extends Funcionario {
    @Override
    public double getBonificacion() {
        System.out.print("+20% ");
        return super.getSalario() * 0.2;
    }
}
