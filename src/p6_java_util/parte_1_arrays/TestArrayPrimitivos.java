package p6_java_util.parte_1_arrays;

public class TestArrayPrimitivos {
    public static void main(String[] args) {
        int[] edades = new int[11];
        int[] primitivos = {0,1,2,3,4,5,6};

        for (int i = 0; i < edades.length; i++) {
            edades[i] = i*i;
        }

        for (int edad : edades) {
            System.out.print(edad + " ");
        }
        System.out.println();
        for (int num : primitivos) {
            System.out.print(num + " ");
        }
    }
}
