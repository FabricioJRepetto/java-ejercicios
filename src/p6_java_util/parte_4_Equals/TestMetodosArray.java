package p6_java_util.parte_4_Equals;

import p5_java_lang.arg.com.bytebank.modelos.*;
import p6_java_util.parte_3_ArrayList_Generics.GuardaCuentas;

import java.util.ArrayList;

public class TestMetodosArray {
    public static void main(String[] args) {
        ArrayList<Cuenta> lista = new ArrayList<>();

        CuentaCorriente cc1 = new CuentaCorriente(22, 5);
        CuentaCorriente cc2 = new CuentaCorriente(32, 9);
        CuentaCorriente cc3 = cc1; // igual por refe
        CuentaCorriente cc4 = new CuentaCorriente(22, 5); // igual por valores

        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);

        System.out.println(".size() muestra la cantidad de elementos en la lista: " + lista.size());
        System.out.println(".length muestra la capacidad de la lista: " + lista.toArray().length);

        // Checkeo por referencia
        boolean contiene = lista.contains(cc1);
        if (contiene) {
            System.out.println("Contiene esa referencia");
        }

        // Checkeo por valores
        if (cc1.equals(cc3)) {
            System.out.println("Tienen los mismos valores");
        }
        boolean sonIguales = lista.contains(cc4);
        if (sonIguales) {
            /* cc4 no fue agragada a la lista
               Pero el método .contains() utiliza .equals() para verificar si son el mismo.
               El metodo original verifica si son el mismo elemento en memoria, el override
               que hicimos verífica si los obj tienen las mismas caracteristicas, entonces
               .equals() retorna ahora true. */
            System.out.println("Hay un obj con los mismos valores en la lista");
        }

    }
}
