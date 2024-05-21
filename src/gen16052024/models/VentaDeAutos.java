package gen16052024.models;

import java.util.ArrayList;
import java.util.List;

public class VentaDeAutos {

    public static void main(String[] args) {

        //Creo una lista de autos vacía
        List<Auto> listaDeAutos = new ArrayList<>();

        //Creamos nuevas instancias
        Auto nuevoAuto = new Auto("Negro", 4);
        Corolla nuevoCorolla = new Corolla("Plata", 4, true);

        //No puedo crear una instancia de una interfaz, puedo llamar a la interfaz para el tipo de dato pero inicializarla con la clase en concreto
        Vehiculo nuevoVehiculo = nuevoAuto;

        listaDeAutos.add(nuevoAuto);
        listaDeAutos.add(nuevoCorolla);

        nuevoVehiculo.acelerar();






    }
}
