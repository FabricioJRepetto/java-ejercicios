package p4_excepciones.parte_6;

public class Conexion implements AutoCloseable {

    public Conexion() {
        System.out.println("Abriendo conexión");
         throw new IllegalStateException();
    }

    public void leerDatos() {
        System.out.println("Recibiendo datos");
    }

    public void cerrar() {
        System.out.println("Cerrando conexión");
    }

    @Override
    public void close() throws Exception {
        cerrar();
    }
}
