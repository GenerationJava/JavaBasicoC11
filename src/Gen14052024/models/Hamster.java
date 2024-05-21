package Gen14052024.models;

public class Hamster extends Mascota {

    //Atributos
    private String pelajeHamster;
    private Boolean estaVivo;
    private Boolean estaHibernando;

    //Constructores
    public Hamster(String nombreMascota, Integer edadMascota, String colorMascota, Double pesoMascota, String tamanioMascota, Boolean estaVacunado, String pelajeHamster, Boolean estaVivo, Boolean estaHibernando) {
        super(nombreMascota, edadMascota, colorMascota, pesoMascota, tamanioMascota, estaVacunado);
        this.pelajeHamster = pelajeHamster;
        this.estaVivo = estaVivo;
        this.estaHibernando = estaHibernando;
    }

    public Hamster(String pelajeHamster, Boolean estaVivo, Boolean estaHibernando) {
        this.pelajeHamster = pelajeHamster;
        this.estaVivo = estaVivo;
        this.estaHibernando = estaHibernando;
    }

    public Hamster() {

    }

    //Getter & Setter
    public String getPelajeHamster() {
        return pelajeHamster;
    }

    public void setPelajeHamster(String pelajeHamster) {
        this.pelajeHamster = pelajeHamster;
    }

    public Boolean getEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(Boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public Boolean getEstaHibernando() {
        return estaHibernando;
    }

    public void setEstaHibernando(Boolean estaHibernando) {
        this.estaHibernando = estaHibernando;
    }

    //Sobrescribimos los métodos que vienen de la implementación de Animal por parte de Mascota(Superclase)
    @Override
    public String vocalizar() {
        return "Cui cui";
    }

    @Override
    public String alimentarse() {
        return "Semillas";
    }



    @Override
    public String toString() {
        return "Hamster{" +
                "pelajeHamster='" + pelajeHamster + '\'' +
                ", estaVivo=" + estaVivo +
                ", estaHibernando=" + estaHibernando +
                '}';
    }
}
