package Gen10052024;

import java.util.Arrays;

public class ArreglosEstaticos {

    public static void main(String[] args) {

        //Los arreglos estáticos son estructuras de datos, no permiten que incrementemos la cantidad que vamos a almacenar

        //Podemos inicializar un array estático con llaves y separando los valores por coma
        int[] arrayDeEnteros = {2,4,6,8,10};
        // Si deseamos imprimir el contenido, podemos llamar a la clase Arrays y usar el método toString()
        System.out.println(Arrays.toString(arrayDeEnteros));
        //Los array estáticos tienen la propiedad length que nos entrega la longitud, acá también inician con índice 0
        //Longitud hace referencia al número de datos que tengo dentro de mi array
        //El índice hace referencia a la posición de cada dato dentro de mi array

        System.out.println(arrayDeEnteros.length);
        //Para ver el índice, podemos hacerlo indicando la posición con []
        System.out.println("El item en la posicion 3, es " + arrayDeEnteros[3]);

        //Un array estático, se puede incializan los valores en 0, indicando la longitud máxima que puede tener
        int[] arrayVacio = new int[4];
        System.out.println(Arrays.toString(arrayVacio));

        double[] arrayDeDecimales;
        char[] arrayDeCaracteres;
        String[] arrayDeString;

        //Modificar
        arrayVacio[1] = 10;
        //arrayVacio[4] = 5; No puedo agregar más allá del índice máximo del array
        System.out.println(Arrays.toString(arrayVacio));

        //Iterar sobre este array
        for (int i = 0; i < arrayVacio.length; i++) {
            System.out.println("El item en esta vuelta es el = " + arrayVacio[i]);
        }

        System.out.println("********************");
        String[] estudiantes = {"Vicente", "Kevin", "Max", "Constanza"};

        //For Each es una versión más concisa del for para trabajar con arrays
        for (String estudiante : estudiantes) {
            //En el for each indicamos una variable que va a tomar cada valor dentro del array
            System.out.println("El estudiante en esta ocasión es " + estudiante);
        }



    }

}
