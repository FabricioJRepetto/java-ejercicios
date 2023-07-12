package p6_java_util.parte_7y8_sort_ClaseAnonima_Lambda;

import p5_java_lang.arg.com.bytebank.modelos.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOrden {
    public static void main(String[] args) {
        Cuenta cc1 = new CuentaCorriente(22,33);
        cc1.depositar(333);
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Franco");
        cc1.setTitular(cliente1);

        Cuenta cc2 = new CuentaCorriente(2,44);
        cc2.depositar(444);
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Hernan");
        cc2.setTitular(cliente2);

        Cuenta cc3 = new CuentaCorriente(30,11);
        cc3.depositar(111);
        Cliente cliente3 = new Cliente();
        cliente3.setNombre("Rosa");
        cc3.setTitular(cliente3);

        Cuenta cc4 = new CuentaCorriente(1,22);
        cc4.depositar(222);
        Cliente cliente4 = new Cliente();
        cliente4.setNombre("Agustina");
        cc4.setTitular(cliente4);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("--- Orden original");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        System.out.println("---");


        // _ ----- Ordenamiento de las cuentas -----


        // * Collections.sort() & Comparable<T> (forma antigua) -----------
        /*
            Collections.sort recibe una lista de objetos de una CLASE que IMPLEMENTA Comparable.
            Esta clase implementa un método llamado "compareTo" con la lógica
            de ordenamiento por defecto (orden natural).
         */

        // ? --- Implementando Comparable en la clase Cuenta:
        // Collections.sort(lista);

        // ? --- Forma simplificada, utilizando una Clase anónima:
        // Collections.sort(lista, new Comparator<Cuenta>() {
        //    @Override
        //    public int compare(Cuenta o1, Cuenta o2) {
        //        return Integer.compare(o1.getAgencia(), o2.getAgencia());
        //    }
        // });

        // ? --- Utilizando Lambdas:
        Collections.sort(lista, (c1, c2) ->
                Integer.compare(c1.getNumero(), c2.getNumero())
        );


        // * List.sort() & Comparator<T> (java 8) -----------
        /*
            List.sort recibe como argumento una INSTANCIA que IMPLEMENTA
            Comparator.
                Comparator es una Interfaz Funcional.
                Las interfaces funcionales son aquellas que tienen un
                solo metodo para implementar. Ese método puede ser "default",
                y puede definirse en la misma Interface.

                .sort(Comparator<? super E>)

            Esta clase implementa un método llamado "compare" con la lógica
            de ordenamiento.
         */

        // ? --- Definiendo las clases (más abajo):
        // lista.sort(new OrdenadorPorNumeroDeCuenta());
        // lista.sort(new OrdenadorPorNombre());

        // ? --- Forma simplificada, sin definir clases (Clase anónima):
        // lista.sort(new Comparator<Cuenta>() {
        //   @Override
        //   public int compare(Cuenta o1, Cuenta o2) {
        //       return Integer.compare(o1.getNumero(), o2.getNumero());
        //   }
        // });

        // ? --- Utilizando Lambdas:
        lista.sort((c1, c2) -> {
            return Integer.compare(c1.getNumero(), c2.getNumero());
        });


        // * Imprimir lista ordenada -----------
        // ? for each
        // for (Cuenta cuenta : lista) {
        //    System.out.println(cuenta);
        // }

        // ? lista.forEach + Lambda
        // lista.forEach(cuenta -> System.out.println(cuenta));

        // ? lista.forEach + method reference
        lista.forEach(System.out::println);
    }
}

class OrdenadorPorNumeroDeCuenta implements Comparator<Cuenta> {
    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        // Forma vueltera
        // if (o1.getNumero() == o2.getNumero()) {
        //     return 0;
        // } else if (o1.getNumero() > o2.getNumero()) {
        //     return 1;
        // }
        // return -1;

        // Forma refactorizada
        // return o1.getNumero() - o2.getNumero();

        // Forma Wrapper
        return Integer.compare(o1.getNumero(), o2.getNumero());
    }
}
class OrdenadorPorNombre implements Comparator<Cuenta> {
    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        String n1 = o1.getTitular().getNombre();
        String n2 = o2.getTitular().getNombre();

        return n1.compareTo(n2);
    }
}
