package Gen09052024;

import java.util.Random;
import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        //Búcle While, este bucle va a ejecutar el bloque de código de manera indefinida si no se no maneja una condición de término
        Scanner input = new Scanner(System.in);

        //Hay que manejar la condición de término para que no se ejecute de manera infinita

        //Contador Despegue
        int contador = 10;

        while (contador >= 0) {
            //Va a ejecutarse el bloque de código mientras la condicións sea verdadera
            System.out.println(contador);
            contador--;//Restarle 1 a contador con cada iteración
        }
        System.out.println("Despegó el cohote, ahora quieres contar de nuevo? Introduce un número");
        contador = input.nextInt();

        //Bucle Do-While,tiene un bloque Do que se va a ejecutar por lo menos una vez incluso si la condición en While es falsa
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(10) + 1;
        input.nextLine();
        int numeroElegido;

        do {//Este se va a ejecutar por lo menos una vez
            System.out.println("Introduce un número del 1 al 10");
            numeroElegido = input.nextInt();
            if (numeroElegido == numeroAleatorio ) {
                System.out.println("Felicidades, adivinaste");
            }
        } while (numeroElegido != numeroAleatorio); //Condición que mientras sea verdadera, se va  a ejecutar lo que esté en el Do

        //Bucle for, dentro de su sintaxis va a manejar una variable iteradora, la condición de término y la operación sobre la variable iteradora
        /**
        for (int i = 0; i <= 10; i++) {
            System.out.println("En esta vuelta i vale = " + i);
        }**/

        //Tabla de multiplicar usando el for
        int numeroParaTabla = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(" El número escogido: " + numeroParaTabla + " x " + i + " es igual = " + (numeroParaTabla*i));
        }



    }
}
