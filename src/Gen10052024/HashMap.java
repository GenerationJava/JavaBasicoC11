package Gen10052024;

import Gen13052024.Gato;
import Gen13052024.Persona;

import java.util.Map;

public class HashMap {

    public static int sumar(int numA, int numB) {
        int resultado = numA + numB;
        return resultado;
    }


    public static void main(String[] args) {
        //Mapa de los gatos
        Map<Persona, Gato> mapaDeGatos = new java.util.HashMap<>();
        Persona persona1 = new Persona("Henry", 21);
        //Gato gato1 = new Gato("Pelusa");

        //Agregamos al HashMap
        //mapaDeGatos.put(persona1, gato1);
        System.out.println(mapaDeGatos);



        System.out.println("********************");





        //Map o mapas son una estructura de datos que trabaja en par llave=valor (key=value)

        Map<String, String> entrenadoresPokemon = new java.util.HashMap<>();

        //Agregar a un HashMap, el put trabaja con dos argumentos que son la clave y el valor
        entrenadoresPokemon.put("Benjamin", "Tyranitar");
        entrenadoresPokemon.put("Carlos", "Hitmonchan");
        entrenadoresPokemon.put("Fabian", "Charmander");
        entrenadoresPokemon.put("Kevin", "Gengar");
        entrenadoresPokemon.put("Remi", "Agumon");

        System.out.println(entrenadoresPokemon);

        // El método .get() necesita que indiquemos la clave, obtener valores por la clave
        System.out.println("El pokemon favorito de Fabian es " + entrenadoresPokemon.get("Fabian"));

        // El método .remove(), funciona recibiendo una clave o key
        entrenadoresPokemon.remove("Remi");
        System.out.println(entrenadoresPokemon);

        // Verificar la longitud del map
        System.out.println(entrenadoresPokemon.size());

        // Verificar si un elemento existe
        boolean existeEnElMapa = entrenadoresPokemon.containsKey("Remi");
        System.out.println("Buscamos al Remi y el resultado fue " + existeEnElMapa);

        //Los HashMap tienen un método KeySet() para crear una lista de las claves, podemos iterar sobre ellas con un forEach
        for ( String clave : entrenadoresPokemon.keySet() ) {
            System.out.println("El entrenador " + clave  + " ganó en esta ronda con " + entrenadoresPokemon.get(clave));
        }





    }
}
