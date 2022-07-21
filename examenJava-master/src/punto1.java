public class punto1 {
    public static void main(String[] args) {
        // Escribir un programa que muestre por pantalla
        // la tabla de multiplicar del 1 al 10 usando ciclos.

        int m;
        String letra;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                m = i * j;
                System.out.println(i + " x " + j + " = " + m);
            }
            System.out.println("---------------------------------------");
        }

    }
}