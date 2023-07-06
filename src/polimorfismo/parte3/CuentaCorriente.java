package parte3;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(int agencia) {
        super(agencia);
    }

    @Override
    public boolean transferir(double valor, Cuenta destino) {
        double comision = 0.2;
        return super.transferir(valor + comision, destino);
    }

    @Override
    public boolean retirar(double valor) {
        double comision = 0.5;
        return super.retirar(valor + comision);
    }
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
}
