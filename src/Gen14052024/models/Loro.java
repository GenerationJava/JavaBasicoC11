package Gen14052024.models;

public class Loro extends Mascota{

    //Atributos
    private Boolean tienePlumaje;

    //Constructores
    public Loro(Boolean tienePlumaje) {
        this.tienePlumaje = tienePlumaje;
    }

    @Override
    public String toString() {
        return "El Loro tiene muchos colores";
    }


}
