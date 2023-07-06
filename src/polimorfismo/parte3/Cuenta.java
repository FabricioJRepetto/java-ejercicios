package parte3;

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

    public static int getContador() {
        return contador;
    }

    public abstract void depositar(double valor);
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Cuenta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
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
}
