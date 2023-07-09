package parte3;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setNombre("Diego");
        diego.setDocumento("46000000");
        diego.setSalario(1000);

        System.out.println(diego.getBonificacion());

        Gerente gerente = new Gerente();
        gerente.setNombre("Gerente Man");
        gerente.setSalario(2000);
        gerente.setClave("Contraseña");

        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("Contraseña"));
    }
}
