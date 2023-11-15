package Primer_cuestionario;

public class EvaluacionTecnicaPil {

    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        /****
         * TEMAS:
         *   - Tipos de datos.
         *   - Flujos de control.
         *   - Operadores.
         *   - Clases System.

         * CONSIGNAS:
         * 1. Declará al menos tres variables con tipos de datos primitivos.
         * 2. A las variables declaradas anteriormente asignales un valor
         *    y realizá al menos dos cálculos matemáticos utilizando -operadores aritméticos-.
         * 3. Planteá tres condiciones lógicas que cumplan con lo siguiente:
         *      a. Condición verdadera --> Imprimí por pantalla el resultado de los cálculos anteriores.
         *         Condición falsa --> Imprimí por pantalla un mensaje de error.
         *      b. Condición verdadera --> Siempre que se cumpla, incrementá un valor hasta que éste llegue al doble de su valor inicial.
         *                                 Antes de realizar esta condición, imprimí el valor inicial de la variable que vas a modificar.
         *                                 Finalmente, imprimí por pantalla el valor final.
         *      c. Iteración --> Realizá N cantidad de impresiones, siendo N un tercio del valor de la variable del punto 'b'.
         ****/

        imprimirConsigna(1);
        // Desarrollo de la consigna 1.
        int num1,num2,num3;

        imprimirConsigna(2);
        // Desarrollo de la consigna 2.
        num1 = 5;
        num2 = 10;
        num3 = 15;

        int suma = num1 + num2;
        int resta = num3 - num1;

        imprimirConsigna(3);
        // Desarrollo de la consigna 3.
        if (num1 < num2){
            System.out.println("suma = " + suma);
            System.out.println("resta = " + resta);
        }

        if (num3 < num1){
            System.out.println("Ha ocurrido un error");
        }

        if (num2 > num1){
            System.out.println("El valor inicial de num1 es: " + num1);
            while (num1 < 2 * 5) {
                num1++;

            }

            System.out.println("El valor final de num1 es: " + num1);

        }

        int N = num1 / 3;
        for (int i = 0; i < N; i++) {
            System.out.println("Impresión número:  " + (i + 1));
        }
    }

    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("*******************************************");
        System.out.println("Bienvenidos a la primer Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    private static void imprimirConsigna(int numeroConsigna) {
        System.out.println("**********");
        System.out.println("CONSIGNA " + numeroConsigna);
        System.out.println("**********\n");
    }
}