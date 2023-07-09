package p3_polimorfismo.parte3;

import p4_excepciones.parte_5.CuentasException;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(int agencia) {
        super(agencia);
    }

    @Override
    public void transferir(double valor, Cuenta destino) throws CuentasException {
        double comision = 0.2;
        super.transferir(valor + comision, destino);
    }

    @Override
    public void retirar(double valor) throws CuentasException {
        double comision = 0.5;
        super.retirar(valor + comision);
    }
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
}
