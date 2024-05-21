package gen16052024.models;

public class Corolla extends Auto {

    //Atributos
    private Boolean tipoSedan;

    //Constructores
    public Corolla(String colorAuto, Integer numeroRuedas, Boolean tipoSedan) {
        super(colorAuto, numeroRuedas);
        this.tipoSedan = tipoSedan;
    }

    public Corolla() {
    }

    //Getter y setter
    public Boolean getTipoSedan() {
        return tipoSedan;
    }

    public void setTipoSedan(Boolean tipoSedan) {
        this.tipoSedan = tipoSedan;
    }
}
