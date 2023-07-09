package p3_polimorfismo.parte1;

public class Condicionales {
    public static void main(String[] args) {
        int edad = 28;
        int cantidadPersonas = 2;
        boolean esPareja = cantidadPersonas > 1;
        boolean puedeEntrar = edad >= 18 && esPareja;

        if (puedeEntrar)
            System.out.println("Hello motherfuckers");
        else
            System.out.println("Fuck off kido");
    }
}
