package parte2;

public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(1);

        primeraCuenta.depositar(1000);
        System.out.println(primeraCuenta.getClass());
    }
}
