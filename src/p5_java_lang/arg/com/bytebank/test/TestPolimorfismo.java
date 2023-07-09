package p5_java_lang.arg.com.bytebank.test;

import  p5_java_lang.arg.com.bytebank.modelos.*;
public class TestPolimorfismo { // Polimorfismo
    public static void main(String[] args) {
        // El elemento más genérico puede adaptarse al más específico,
        // pero seguirá teniendo solo los metodos y atributos de la referencia más genérica.
        // Todos los Gerentes son Funcionarios
        // Funcionario funcionario = new Gerente();
        Funcionario funcionario = new Contador();
        funcionario.setNombre("Franco");

        Gerente gerente = new Gerente();
        gerente.setNombre("Florencia");

        Contador contador = new Contador();
        contador.setNombre("Agustoni");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);
        contador.setSalario(5000);

        ControlBonificaciones control = new ControlBonificaciones();

        control.registrarBono(funcionario);
        control.registrarBono(gerente);
        control.registrarBono(contador);
    }
}
