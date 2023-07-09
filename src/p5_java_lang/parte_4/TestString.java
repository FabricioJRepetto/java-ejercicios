package p5_java_lang.parte_4;

public class TestString {
    public static void main(String[] args) {
        String nombre = "Negro";
        nombre = nombre.replace("o", "iiito");

        System.out.println(nombre);

        // Concatenar varios strings de manera eficiente (hablando de rendimiento)
        StringBuilder builder = new StringBuilder("Ayuda");
        builder.append("! ");
        builder.append("me ");
        builder.append("subi ");
        builder.append("en el ");
        builder.append("omnibus ");
        builder.append("equivocado ");

        String texto = builder.toString();
        System.out.println(texto);
    }
}
