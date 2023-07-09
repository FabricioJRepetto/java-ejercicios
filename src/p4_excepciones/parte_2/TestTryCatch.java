package p4_excepciones.parte_2;

public class TestTryCatch {
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

            try { // Intentar código

                // ArithmeticException
                // int num = 0;
                // int res = 30 / num;
                // System.out.println(res);

                // NullPointerException
                String test = null;
                // System.out.println(test.toString());

                // Throw
                throw new ArithmeticException();

            } catch(Throwable exc) { // Atrapar Excepción
                System.out.println(exc.getMessage());
                exc.printStackTrace();
                // Se pueden agregar varios catch
                // o varios tipos de excepciones
                    // catch(ArithmeticException | NullPointerException exc)
                // o cualquier tipo de Excepción
                    // catch(Throwable exc)
            }

        System.out.println("Fin de metodo2");
    }
}
