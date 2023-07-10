package p6_java_util.parte_5_Vector;

import p5_java_lang.arg.com.bytebank.modelos.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestListas {
    public static void main(String[] args) {
        // LIST es una interface que implementan las listas:
        // ArrayList, LinkedList y Vector.
        // Mediante polimorfismo podemos declararlo de esta manera:

        List<Cuenta> listaLL = new LinkedList<>();
        List<Cuenta> listaAL = new ArrayList<>();
        List<Cuenta> listaV = new Vector<>();

        /* Vector -----
           Es thread safe: es un unico objeto para todos los threads.
           O sea que todas las pilas de ejecución pasan por él una a la vez.
           Ya no se utiliza porque tiene mucho impacto en el rendimiento.
        * */
    }
}
