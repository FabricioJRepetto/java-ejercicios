package p6_java_util.parte_6_Wrappers;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {
    public static void main(String[] args) {
        int numero = 40;

        List lista = new ArrayList();
        /* El metodo .add() acepta como argumento Objects
           Al momento de recibir un primitivo como int
           ocurre el AUTOBOXING, encapsula el valor en un objeto,
           en este caso Integer

                lista.add(new Integer(numero)) (deprecado)

        Las clases que engloban un primitivo se llaman WRAPPER. */
        lista.add(numero);

        Integer primitivoObjeto = Integer.valueOf(30);
        /* También existe el UNBOXING. Cuando asignamos un "primitivo objeto" a una variable
           se produce un unboxing, en vez de referenciar al objeto, se toma el valor del mismo.
        */
        int numeroObjeto = primitivoObjeto;

        /* Métodos que utilzia para el UNBOXING */
        int intValue = primitivoObjeto.intValue();
        byte byteValue = primitivoObjeto.byteValue();
        double doubleValue = primitivoObjeto.doubleValue();

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.SIZE);
//        System.out.println(Integer.BYTES);

        String diaComoTexto = "29";
        int dia2 = Integer.parseInt(diaComoTexto); // más adecuado
        int dia = Integer.valueOf(diaComoTexto); // más vueltero, devuelve referencia y luego realiza unboxing

        System.out.println(dia);
        System.out.println(dia2);
    }
}
