package Gen13052024;

//La clase define un plano o esquema que indica lo que describe al objeto(Atributos) y cómo se comporta(Métodos)
public class Gato {

    /**ATRIBUTOS**/
    //Atributos o características del gato
    String nombreGato;
    Integer edadGato;
    Boolean estaCastrado;
    String colorGato;


    //region CONSTRUCTORES
    //Contructores, son métodos que permiten crear la instancia con sus campos llenos o vacíos
    //Constructor lleno
    public Gato(String nombreGato, Integer edadGato, Boolean estaCastrado, String colorGato) {
        this.nombreGato = nombreGato;
        this.edadGato = edadGato;
        this.estaCastrado = estaCastrado;
        this.colorGato = colorGato;
    }

    public Gato(String nombreGato, Integer edadGato, String colorGato) {
        this.nombreGato = nombreGato;
        this.edadGato = edadGato;
        this.colorGato = colorGato;
    }

    //Contructor vacío, me permite generar una nueva instancia sin llenar sus campos
    public Gato() {
    }

    //endregion

    /**GETTER & SETTER - ACCESADORES Y MUTADORES**/
    //Métodos para acceder al valor de un atributo y para cambiarlo
    //Getter o accesadores
    public String getNombreGato() {
        return nombreGato;
    }

    //Setter o mutador
    public void setNombreGato(String nombreGato) {
        this.nombreGato = nombreGato;
    }

    public Integer getEdadGato() {
        return edadGato;
    }

    public void setEdadGato(Integer edadGato) {
        this.edadGato = edadGato;
    }

    public Boolean getEstaCastrado() {
        return estaCastrado;
    }

    public void setEstaCastrado(Boolean estaCastrado) {
        this.estaCastrado = estaCastrado;
    }

    public String getColorGato() {
        return colorGato;
    }

    public void setColorGato(String colorGato) {
        this.colorGato = colorGato;
    }

    /**MÉTODOS PROPIOS DE LA CLASE*/
    public void maullar() {
        System.out.println("Miau");
    }


    /**MÉTODO TO-STRING*/
    //Anotación que sobrescribe el método toString para que funcione de la manera en que estamos declarando
    @Override
    public String toString() {
        return "Gato{" +
                "nombreGato='" + nombreGato + '\'' +
                ", edadGato=" + edadGato +
                ", estaCastrado=" + estaCastrado +
                ", colorGato='" + colorGato + '\'' +
                '}';
    }


}
