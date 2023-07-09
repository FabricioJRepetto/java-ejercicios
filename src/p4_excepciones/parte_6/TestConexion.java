package p4_excepciones.parte_6;

public class TestConexion {
    public static void main(String[] args) throws Exception {
        /*
        Conexion con = null;
        try {
            con = new Conexion();
            con.leerDatos();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            con.cerrar();
        } */

        /*
        * Try with resourses:
        * sirve para recursos que necesitan ser "cerrados" luego de usarlos,
        * como archivos o conexiones.
        * El objeto se instancia como un argumento del try y debe implementar AutoClosable.
        * El recurso se "cerrará" automáticamente como un finally ante un error o al finalizar el código.
        * Sirve para evitar excepciones del tipo NullPointer (como en el ejemplo de arriba).
        * */
        try (Conexion con = new Conexion()) {
            con.leerDatos();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
