package Gen13052024;

import java.util.Scanner;

public class SistemaAdopcion {

    public static void main(String[] args) {
        Scanner inputMascotas = new Scanner(System.in);

        //Creación de instancias
        Perro perro1 = new Perro("Firulais","Kiltro", 5);
        //Para perro1, obtén el valor que está en atributo nombrePerro
        System.out.println("El nombre de tu mascota es " + perro1.getNombrePerro());
        //Para perro1, cambia el valor que está en atributo nombrePerro
        System.out.println("Indica un nombre nuevo para el perro");
        perro1.setNombrePerro(inputMascotas.nextLine());
        System.out.println("Ahora el perro se llama " + perro1.getNombrePerro());


    }
}
