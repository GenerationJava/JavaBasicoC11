package Gen13052024;

import Gen14052024.models.Hamster;
import Gen14052024.models.Loro;
import Gen14052024.models.Mascota;
import gen16052024.models.EspecieSilvestre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaAdopcion {

    public static void main(String[] args) {
        Scanner inputMascotas = new Scanner(System.in);

        Gato nuevoGato = new Gato("Luna", 5, true, "Marron");
        System.out.println(nuevoGato);

        //Creación de instancias
        Perro perro1 = new Perro("Firulais","Kiltro", 5);
        //Para perro1, obtén el valor que está en atributo nombrePerro
        System.out.println("El nombre de tu mascota es " + perro1.getNombrePerro());
        //Para perro1, cambia el valor que está en atributo nombrePerro
        System.out.println("Indica un nombre nuevo para el perro");
        perro1.setNombrePerro(inputMascotas.nextLine());
        System.out.println("Ahora el perro se llama " + perro1.getNombrePerro());



        //Creamos instancias de nuevas mascotas
        Mascota nuevaMascota = new Mascota();
        Hamster nuevoHamster = new Hamster();
        Loro nuevoLoro = new Loro(true);
        EspecieSilvestre nuevaEspecie = new EspecieSilvestre();

        List<Hamster> listaHamsters = new ArrayList<>();


        Mascota otroHamster = new Hamster();
        //En este caso no puedo
        //Hamster unNuevoHamster = new Mascota();


        System.out.println("Mascota se ve así " + nuevaMascota);
        System.out.println("Hamster se ve así " + nuevoHamster);

        System.out.println("El Loro se ve así " + nuevoLoro);



        nuevaMascota.vocalizar();
        nuevoHamster.vocalizar();






    }
}
