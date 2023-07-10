package p5_java_lang.arg.com.bytebank.modelos;

import p4_excepciones.parte_5.CuentasException;

public abstract class Cuenta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    // Variable de clase, independiente de las instancias
    private static int contador = 0;

    // Constructor
    public Cuenta(int agencia) {
        if (agencia <= 0) {
            System.out.println("Agencia no puede ser menor a 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }

        titular = new Cliente();

        contador++;
    }
    public Cuenta(int agencia, int numero) {
        if (agencia <= 0) {
            System.out.println("Agencia no puede ser menor a 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        if (numero <= 0) {
            System.out.println("Número no puede ser menor a 0");
            this.numero = 1;
        } else {
            this.numero = numero;
        }

        titular = new Cliente();

        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public abstract void depositar(double valor);

    /**
     * Descuenta el valor del saldo de la cuenta.
     * Si el saldo es menor al valor, lanza una excepción.
     *
     * @param valor
     * @throws CuentasException
     */
    public void retirar(double valor) throws CuentasException {
        if (this.saldo < valor) {
            throw new CuentasException("Saldo insuficiente.");
        }
        this.saldo -= valor;
    }

    /**
     * Descuenta el valor del saldo de la cuenta y lo deposita en la cuenta destino.
     * Si el saldo es menor al valor, lanza una excepción.
     *
     * @param valor
     * @param destino
     * @throws CuentasException
     */
    public void transferir(double valor, Cuenta destino) throws CuentasException {
        if (this.saldo < valor) {
            throw new CuentasException("Saldo insuficiente.");
        }
        this.saldo -= valor;
        destino.depositar(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public boolean equals(Object obj) {
        Cuenta cuenta = (Cuenta) obj;
        return this.agencia == cuenta.getAgencia() &&
                this.numero == cuenta.getNumero();
    }

    @Override
    public String toString() {
        return "Agencia: " + this.agencia + " - Numero: " + this.numero + " / Titular: " + this.titular.getNombre() + " - Saldo: $" + this.saldo;
    }
}
