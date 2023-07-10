package p6_java_util.parte_3_ArrayList_Generics;

import p5_java_lang.arg.com.bytebank.modelos.*;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // Generics:
        // <> Forzar el tipo permitido
        ArrayList<Cuenta> lista = new ArrayList<>();
        CuentaCorriente cc = new CuentaCorriente(1);
        CuentaCorriente cc2 = new CuentaCorriente(2);

        Cliente cliente = new Cliente();

        lista.add(cc);
        lista.add(cc2);
        // lista.add(cliente); // La lista no acepta obj que no sean tipo Cuenta

        Cuenta c0 = lista.get(0);
        System.out.println(lista.get(0));
        System.out.println(c0);

        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        System.out.println(".size() muestra la cantidad de elementos en la lista: " + lista.size());
        System.out.println(".length muestra la capacidad de la lista: " + lista.toArray().length);

        // ---------------

        // Se puede definir una capacidad inicial del ArrayList,
        // ya que su constructor es sobrecargado.

        ArrayList<String> array1 = new ArrayList<>(26);
        array1.add("RJ");
        array1.add("SP");
        // ...otros elementos

        // Se puede crear una nueva lista a partir de otra ya existente

        ArrayList array2 = new ArrayList(array1); //creando basada en la primera lista
    }
}
