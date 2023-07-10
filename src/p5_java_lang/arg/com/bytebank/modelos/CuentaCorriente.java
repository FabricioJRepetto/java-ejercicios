package p5_java_lang.arg.com.bytebank.modelos;

import p4_excepciones.parte_5.CuentasException;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(int agencia) {
        super(agencia);
    }
    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
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
