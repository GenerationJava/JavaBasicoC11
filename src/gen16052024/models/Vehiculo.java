package gen16052024.models;

//Acá estamos aplicando abstracción al crear una interfaz común para todos los vehículos
//Acá se definen todos los métodos que comparten los vehículos
public interface Vehiculo {

    //Acá declaramos los métodos a ser implementados por las clases específicas
    public void arrancar();

    public void transportar();

    public void acelerar();

}
