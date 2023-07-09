package p5_java_lang.arg.com.bytebank.modelos;

public class Contador extends Funcionario {
    @Override
    public double getBonificacion() {
        System.out.print("+20% ");
        return super.getSalario() * 0.2;
    }
}
