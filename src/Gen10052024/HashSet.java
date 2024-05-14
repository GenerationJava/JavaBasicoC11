package Gen10052024;

import Gen13052024.Gato;

import java.util.Scanner;
import java.util.Set;

public class HashSet {

    public static void main(String[] args) {
        //Los Set o conjuntos, no permiten duplicados y no tiene un orden preestablecido
        Set<Gato> conjuntoDeGatos = new java.util.HashSet<>();
        Scanner inputGato = new Scanner(System.in);

        System.out.println("Indica el nombre del primer gato");
        String nombre = inputGato.next();
        /**Gato gato1 = new Gato();

        Gato gato2 = new Gato("Torita");
        Gato gato3 = new Gato("Garbanzo");
        Gato gato4 = new Gato("Pelusa");

        //Agregamos los gatitos
        conjuntoDeGatos.add(gato1);
        conjuntoDeGatos.add(gato2);
        conjuntoDeGatos.add(gato3);
        conjuntoDeGatos.add(gato4);
         **/

        System.out.println(conjuntoDeGatos);

        //Saber si un gato existe
        //System.out.println("El gato existe en el conjunto? " + conjuntoDeGatos.contains(gato3));



        Set<String> peliculas = new java.util.HashSet<>();
        System.out.println(peliculas);

        //Método para añadir a un set
        peliculas.add("Gladiador");
        peliculas.add("Blade Runner");
        peliculas.add("Shrek");
        peliculas.add("Top Gun");
        peliculas.add("Reyes de las olas");
        System.out.println(peliculas);

        peliculas.add("Shrek");//No permite un duplicado exacto
        peliculas.add("shrek");//Este String es distinto y por tanto no cuenta como duplicado
        System.out.println(peliculas);

        //Remover elementos
        peliculas.remove("shrek");
        System.out.println(peliculas);

        //Verificamos si algo existe
        if ((peliculas.contains("Shrek"))){
            System.out.println("Shrek is love");
        }

        //
        String peliculaFavorita;
        for ( String pelicula : peliculas ) {
            if (pelicula.equals("Shrek")) {
                peliculaFavorita = pelicula;
                System.out.println("La película favorita de la c11 es " + peliculaFavorita);
            }
        }





    }
}
