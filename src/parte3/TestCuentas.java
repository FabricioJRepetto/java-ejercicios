package parte3;

public class TestCuentas {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(12);
        CuentaAhorros ca = new CuentaAhorros(15);

        cc.depositar(1000);
        cc.transferir(500, ca);

        System.out.println(cc.getSaldo());
    }
}
