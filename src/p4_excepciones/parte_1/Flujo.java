package p4_excepciones.parte_1;

public class Flujo {
    // Demostración de la Pila de ejecución.
    public static void main(String[] args) {
        System.out.println("Inicio de main");
        metodo1();
        System.out.println("Fin de main");
    }
    public static void metodo1(){
        System.out.println("Inicio de metodo1");
        metodo2();
        System.out.println("Fin de metodo1");
    }
    public static void metodo2(){
        System.out.println("Inicio de metodo2");
        for(int i =1; i<= 5; i++){
            System.out.println(i);
        }
        System.out.println("Fin de metodo2");
    }
}
