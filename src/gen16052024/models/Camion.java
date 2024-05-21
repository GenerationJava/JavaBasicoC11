package gen16052024.models;

public class Camion implements Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("Enciende un motor más grande");
    }

    @Override
    public void transportar() {
        System.out.println("Transporta a muchas personas o cosas");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelera a 3 km/h");
    }
}
