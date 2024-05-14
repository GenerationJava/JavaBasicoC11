package Gen09052024;

import java.util.Random;
import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        //Bloque IF - "Si esto ocurre, ejecuta el bloque de código"
        // IF -> (CONDICION) {BLOQUE DE CÓDIGO}

        boolean esVerdad = false;

        /**
        if (esVerdad) {
            System.out.println("Esto es verdad, por eso aparece en consola");
        } else {
            System.out.println("Esto es mentira, así que aparece otra cosa");
        }
        **/

        // ELSE-IF
        String eleccion;
        String eleccionDeComputador;

        Scanner input = new Scanner(System.in);


        int numeroAlAzar = (int) (Math.random() * 4) +1; //Solución de Benja
        //Genera un número del 1 al 3


        Random rand = new Random();
        /**int otroNumAlAzar = rand.nextInt(3) + 1;
        System.out.println(otroNumAlAzar);**/


        //CON IF ELSE-IF
        if (numeroAlAzar == 1) {
            eleccionDeComputador = "Piedra";
            //Si número al alzar es 1 la computadora elige piedra
        } else if (numeroAlAzar == 2) {
            eleccionDeComputador = "Papel";
            //Si número al alzar es 2 la computadora elige papel
        } else {
            eleccionDeComputador = "Tijera";
            //Si no es ninguna de las opciones la computadora elige tijera
        }

        int opcion;

        //JUEGO PIEDRA PAPEL O TIJERA
        do {
            System.out.println("Bienvenido al PIEDRA-PAPEL-TIJERA");
            System.out.println("Introduce una opción: Cualquier número para jugar y 0 para salir");
            opcion = input.nextInt();
            if (opcion != 0) {
                System.out.println("Escribe la opción que vas a jugar PIEDRA, PAPEL O TIJERA");
                eleccion = input.next();
                System.out.println("Elegiste " + eleccion);
                if ((eleccion.equalsIgnoreCase("piedra") && eleccionDeComputador.equalsIgnoreCase("papel")) ||
                        (eleccion.equalsIgnoreCase("papel") && eleccionDeComputador.equalsIgnoreCase("tijera")) ||
                        (eleccion.equalsIgnoreCase("tijera") && eleccionDeComputador.equalsIgnoreCase("piedra"))) {
                    System.out.println("Computador gana");
                } else if ((eleccion.equalsIgnoreCase("papel") && eleccionDeComputador.equalsIgnoreCase("piedra")) ||
                        (eleccion.equalsIgnoreCase("tijera") && eleccionDeComputador.equalsIgnoreCase("papel")) ||
                        (eleccion.equalsIgnoreCase("piedra") && eleccionDeComputador.equalsIgnoreCase("tijera"))) {
                    System.out.println("Felicidades! Ganaste la partida");
                } else if (eleccion.equalsIgnoreCase(eleccionDeComputador)){
                    System.out.println("Empataron");
                } else {
                    System.out.println("Esa opción no es válida");
                }
            } else {
                System.out.println("Saliste del programa");
            }
            } while (opcion != 0);





        //System.out.println("La computadora eligió " + eleccionDeComputador);

        //CON SWITCH-CASE, le decimos que tome en cuenta lo que esté dentro de la variable
        String pokemonElegido;
        System.out.println("Elige un pokemon: Charmander - Squirtle - Bulbasaur");

        pokemonElegido = input.next();
        switch (pokemonElegido.toLowerCase()) {
            case "charmander":
                System.out.println("Tu pokemon es de tipo fuego");
                break;
            case "squirtle":
                System.out.println("Tu pokemon es de tipo agua");
                break;
            case "bulbasaur":
                System.out.println("Tu pokemon es de tipo planta");
                break;
            default:
                eleccionDeComputador = "Desconocida";
                break;
        }

        // Operador ternario, va a hacer algo dependiendo de la condición
        // Indico la condición, lo que va después del signo de interrogación es lo que va a ocurrir si se evalúa como true y lo que está después de los : es si se evalúa como false

        String tipoDePokemon = pokemonElegido.toLowerCase().equals("squirtle") ? "Es de tipo agua" : "Es de tipo desconocido";

        System.out.println(tipoDePokemon);

        // NO SE COMPARAN STRINGS CON ==






    }
}
