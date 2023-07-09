package p4_excepciones.parte_3;

public class MiException extends Exception {
    /* Excepciones y Errores
    * Los errores son problemas como StackOverflow,
    * errores dentro de la JVM.
    *
    * Las Excepciones son errores en el código,
    * como por ejemplo divisiones por 0 o variables null no previstas
    *
    * Sí extendemos desde Exception:
    * Convertimos la excepción en CHECKED,
    * ovligandonos a implementar un manejo para ese error.
    * Los métodos que lanzan este error llevan "throws NombreDeLaException" en la firma.
    *
    * Sí extendemos desde RuntimeException:
    * Convertimos la excepción en UNCHECKED,
    * donde sería posible dejar el código sin saber como manejarlo (try/catch)
    * */
    public MiException() {
        super();
    }
    public MiException(String message) {
        super(message);
    }
}
