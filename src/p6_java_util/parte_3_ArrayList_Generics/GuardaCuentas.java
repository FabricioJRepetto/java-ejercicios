package p6_java_util.parte_3_ArrayList_Generics;

import p5_java_lang.arg.com.bytebank.modelos.*;

public class GuardaCuentas {
    private Cuenta[] cuentas;
    private int indice;

    public GuardaCuentas() {
        this.cuentas = new Cuenta[10];
        this.indice = 0;
    }

    public void adicionar(Cuenta cuenta) {
        this.cuentas[this.indice] = cuenta;
        this.indice++;
    }

    public Cuenta obtener(int indice) {
        return this.cuentas[indice];
    }

    public int getCantidadDeCuentas() {
        return this.indice;
    }
}
