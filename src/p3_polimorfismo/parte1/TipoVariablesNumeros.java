package p3_polimorfismo.parte1;

public class TipoVariablesNumeros {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!!");

        // enteros
        int edad = 29;
        System.out.println("Mi edad es: " + edad);
        // los int se redondean si dan como resultado un decimal
        System.out.println(edad / 2);

        // decimales
        double salario = 2250.55;
        System.out.println("Salario: " + salario);

        // distintos tamaños de números
        /*
            int numeroLargoError = 123456789012; <= error, num muy largo para ser int
            long numeroLargo = 1234567890123456789L; // lleva una L al final para especificar el tipo de var
            short numeroCorto = 12345;
            byte numeroMuyCorto = 123; // 8 bits de tamaño
            float decimalCorto = 2.5F; // ¿deprecado?
         */

        // cast: cambiar tipo a una variable
        int salarioEntero = (int) salario; // en este caso elimina la parte decimal
        System.out.println("Cast de double a int " + salarioEntero);
    }
}
