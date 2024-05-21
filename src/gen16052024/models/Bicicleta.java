package gen16052024.models;

public class Bicicleta implements Vehiculo {


    @Override
    public void arrancar() {
        System.out.println("Se pedalea");
    }

    @Override
    public void transportar() {
        System.out.println("LLeva sólo a una persona o dos");

    }

    @Override
    public void acelerar() {
        System.out.println("Acelera a 1 km/h");
    }
}
