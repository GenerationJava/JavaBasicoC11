package gen16052024.models;

public class Auto implements Vehiculo {

    //Atributos
    private String colorAuto;
    private Integer numeroRuedas;

    //Constructor lleno
    public Auto(String colorAuto, Integer numeroRuedas) {
        this.colorAuto = colorAuto;
        this.numeroRuedas = numeroRuedas;
    }


    //Constructor vacío
    public Auto() {
    }

    //Getter & Setter, accesadores y mutadores
    public String getColorAuto() {
        return colorAuto;
    }

    public void setColorAuto(String colorAuto) {
        this.colorAuto = colorAuto;
    }

    public Integer getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(Integer numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    //Acá en los métodos usamos polimorfismo para indicar de qué manera cada clase en particular usa esos métodos
    @Override//Sobrescribe
    public void arrancar() {
        System.out.println("Se enciende el motor");
    }

    @Override
    public void transportar() {
        System.out.println("Lleva a cuatro personas");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelera a 5km/h");
    }



    @Override
    public String toString() {
        return "Auto{" +
                "colorAuto='" + colorAuto + '\'' +
                ", numeroRuedas=" + numeroRuedas +
                '}';
    }
}
