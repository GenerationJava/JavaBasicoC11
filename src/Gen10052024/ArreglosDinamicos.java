package Gen10052024;

import Gen13052024.Gato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArreglosDinamicos {

    public static void main(String[] args) {
        //ArrayList
        ArrayList<Gato> cajaDeGatitos = new ArrayList<>();
        //Creamos la instancia
        Gato gato1 = new Gato();
        //Añadimos un nuevo gato
        cajaDeGatitos.add(gato1);


        //Creamos una nueva instancia de ArrayList vacía
        List<String> estudiantesCohorteOnce = new ArrayList<>();
        System.out.println(estudiantesCohorteOnce);

        //Método para añadir a un ArrayList
        estudiantesCohorteOnce.add("Marcia");// Marcia ocupa el indice 0
        estudiantesCohorteOnce.add(0, "Fabian");//Si le dejamos el índice, desplaza para agregar en esa posición
        estudiantesCohorteOnce.add("Paula");
        estudiantesCohorteOnce.add("Juanito");

        //Si queremos hacer una copia de como estaba el arrayList en un punto, llamando al método stream().collect()
        List<String> copiaDeLaLista = estudiantesCohorteOnce.stream().collect(Collectors.toList());

        System.out.println(estudiantesCohorteOnce);

        //Remover elemento de un ArrayList, podemos borrar indicando el objeto directamente o el índice
        estudiantesCohorteOnce.remove("Juanito");
        System.out.println(estudiantesCohorteOnce);

        estudiantesCohorteOnce.remove(2);
        System.out.println(estudiantesCohorteOnce);

        //Reemplazar, usamos el método set al que le indicamos el índice
        estudiantesCohorteOnce.set(0, "Marco");
        System.out.println(estudiantesCohorteOnce);

        //Longitud del array dinámico
        System.out.println("La longitud es " + estudiantesCohorteOnce.size());

        //Obtener un elemento según el índice
        System.out.println("El elemento en el índice escogido es " + estudiantesCohorteOnce.get(1));

        //Limpiar
        estudiantesCohorteOnce.clear();
        System.out.println(estudiantesCohorteOnce);

        //Buscar si algún
        boolean existeEnBase = copiaDeLaLista.contains("Juanito");
        System.out.println(existeEnBase);

        if (!(copiaDeLaLista.contains("Vicente"))) {
            copiaDeLaLista.add("Nuevo");
            System.out.println(copiaDeLaLista);
        }

        //Ordenar lo que está dentro del ArrayList
        //Llamando a la clase Collections podemos acceder a métodos para las listas
        Collections.sort(copiaDeLaLista);
        System.out.println("La lista de estudiantes por orden alfabético es " + copiaDeLaLista);

        //Revertir el orden de los elementos dentro del ArrayList
        Collections.reverse(copiaDeLaLista);
        System.out.println("La lista con el orden a la inversa es " + copiaDeLaLista);


    }
}
