package p6_java_util.parte_1_arrays;

import p5_java_lang.arg.com.bytebank.modelos.*;

public class TestArrayReferencias {
    public static void main(String[] args) {
        Cuenta[] cuentas = new Cuenta[5];

        CuentaCorriente cc = new CuentaCorriente(22);

        // Referencia
        cuentas[0] = cc;
        // Objeto
        cuentas[1] = new CuentaCorriente(52);

        // Cast
        Object[] referencias = new Object[3];

        CuentaCorriente cc1 = new CuentaCorriente(1);
        CuentaAhorros ca = new CuentaAhorros(1);
        Cliente client = new Cliente();
        client.setNombre("Romulo");

        referencias[0] = cc1;
        referencias[1] = ca;
        referencias[2] = client;
        /* Cuando tenemos un array de Object
         podemos hacer el cast que necesitemos
         siempre y cuando el polimorfismo sea posible

         Si guardamos un obj de otro tipo en un Array de tipo genérico (Obejct[])
                    HAY QUE CASTEAR
         para poder utilizar los métodos del obj. que querramos tomar de la lista.
         */
        Cliente refClient = (Cliente) referencias[2];
        System.out.println(refClient.getNombre());
        // System.out.println(referencias[2].getNombre()); // EXCEPTION

        System.out.println(cuentas[0].getAgencia());
        System.out.println(cuentas[1].getAgencia());
    }
}
