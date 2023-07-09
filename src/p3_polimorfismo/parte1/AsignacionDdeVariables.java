package p3_polimorfismo.parte1;

public class AsignacionDdeVariables {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 9;

        System.out.println(numero2); // 9

        numero2 = numero1;
        System.out.println(numero2); // 5

        numero1 = 88;
        System.out.println(numero2); // 5

        // A diferencia de JS, las variables no apuntan a una dirección en memoria,
        // Al asignar numero2 = numero1; le estamos dando el valor de numero1 a numero2,
        // Cuando numero1 cambia, numero2 sigue teniendo el valor original.

        String saludo = "Hola, mi nombre es ";
        String nombre = "Rómulo ";
        String continuacion = "y mi edad es ";
        int edad = 100;
        System.out.println (saludo + nombre + continuacion + edad);
    }
}
