package Gen14052024.models;

import gen16052024.models.Animal;

public class Mascota implements Animal {

    //Atributos
    private String nombreMascota;
    private Integer edadMascota;
    private String colorMascota;
    private Double pesoMascota;
    private String tamanioMascota;
    private Boolean estaVacunado;

    //Constructor lleno
    public Mascota(String nombreMascota, Integer edadMascota, String colorMascota, Double pesoMascota, String tamanioMascota, Boolean estaVacunado) {
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
        this.colorMascota = colorMascota;
        this.pesoMascota = pesoMascota;
        this.tamanioMascota = tamanioMascota;
        this.estaVacunado = estaVacunado;
    }

    public Mascota() {
    }

    //Getter & Setter
    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Integer getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(Integer edadMascota) {
        this.edadMascota = edadMascota;
    }

    public String getColorMascota() {
        return colorMascota;
    }

    public void setColorMascota(String colorMascota) {
        this.colorMascota = colorMascota;
    }

    public Double getPesoMascota() {
        return pesoMascota;
    }

    public void setPesoMascota(Double pesoMascota) {
        this.pesoMascota = pesoMascota;
    }

    public String getTamanioMascota() {
        return tamanioMascota;
    }

    public void setTamanioMascota(String tamanioMascota) {
        this.tamanioMascota = tamanioMascota;
    }

    public Boolean getEstaVacunado() {
        return estaVacunado;
    }

    public void setEstaVacunado(Boolean estaVacunado) {
        this.estaVacunado = estaVacunado;
    }

    //Declaramos un método en común para las clases que hereden de mascota
    //Acá empezamos a usar polimorfismo al cambiar la manera en que esos métodos se comportan
    @Override
    public String alimentarse() {
        return "";
    }

    @Override
    public String vocalizar() {
        return "";
    }

    @Override
    public String reproducirse() {
        return "";
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombreMascota='" + nombreMascota + '\'' +
                ", edadMascota=" + edadMascota +
                ", colorMascota='" + colorMascota + '\'' +
                ", pesoMascota=" + pesoMascota +
                ", tamanioMascota='" + tamanioMascota + '\'' +
                ", estaVacunado=" + estaVacunado +
                '}';
    }
}
