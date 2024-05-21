package gen16052024.models;


public class EspecieSilvestre implements Animal {

    //Atributo
    private Boolean esLibre;
    //Por ser private puedo acceder a este campo sólo desde esta misma clase

    protected String habitatNatural;
    //Por ser protected puedo acceder a este campo sólo desde esta clase y subclases y lo que esté dentro del mismo package

    public Boolean esAgresivo;


    //Constructores
    public EspecieSilvestre(Boolean esLibre, String habitatNatural, Boolean esAgresivo) {
        this.esLibre = esLibre;
        this.habitatNatural = habitatNatural;
        this.esAgresivo = esAgresivo;
    }

    public EspecieSilvestre() {
    }

    //Getter & Setter
    public Boolean getEsLibre() {
        return esLibre;
    }

    public void setEsLibre(Boolean esLibre) {
        this.esLibre = esLibre;
    }

    public String getHabitatNatural() {
        return habitatNatural;
    }

    public void setHabitatNatural(String habitatNatural) {
        this.habitatNatural = habitatNatural;
    }

    public Boolean getEsAgresivo() {
        return esAgresivo;
    }

    public void setEsAgresivo(Boolean esAgresivo) {
        this.esAgresivo = esAgresivo;
    }

    //Métodos de la interfaz Animal
    @Override
    public String vocalizar() {
        return null;
    }

    @Override
    public String alimentarse() {
        return null;
    }

    @Override
    public String reproducirse() {
        return null;
    }

    /*
    Integer movilizarse() {
        return 5;
    }

    Double movilizarse(Double cantidadKm) {
        return 10.50;
    }

    Float movilizarse(Float cantidadCm) {
        return 1000.50F;
    }
    */





    //Por ser public puedo acceder a este campo desde cualquier otra clase o package


}
