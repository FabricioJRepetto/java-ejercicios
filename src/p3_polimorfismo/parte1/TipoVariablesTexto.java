package parte1;

public class TipoVariablesTexto {
    public static void main(String[] args) {
        // char, soporta un solo carácter o un numero que indica un carácter de la tabla ascii
        char caracter = 'a';
        char charEspecifico = 65;
        char segundocharEspecifico = (char) (charEspecifico - 1);

        System.out.println(caracter);
        System.out.println(charEspecifico);

        // String, no es un primitivo, es un objeto
        String palabra = "Probando movida";
        System.out.println(palabra);
    }
}
