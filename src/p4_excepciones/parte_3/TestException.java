package p4_excepciones.parte_3;

public class TestException {
    public static void main(String[] args) {
        try {
            throw new MiException("Exception personalizada lanzada");

        } catch(MiException me) {
            System.out.println(me.getMessage());
        }
    }
}
