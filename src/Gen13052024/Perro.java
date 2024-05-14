package Gen13052024;

public class Perro {

    //Atributos del perro
    private String nombrePerro;
    private String razaPerro;
    private Integer edadPerro;

    //Constructores
    public Perro(String nombrePerro, String razaPerro, Integer edadPerro) {
        this.nombrePerro = nombrePerro;
        this.razaPerro = razaPerro;
        this.edadPerro = edadPerro;
    }

    public Perro(String nombrePerro, String razaPerro) {
        this.nombrePerro = nombrePerro;
        this.razaPerro = razaPerro;
    }

    public Perro() {
    }

    //Getter y setter
    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    public Integer getEdadPerro() {
        return edadPerro;
    }

    public void setEdadPerro(Integer edadPerro) {
        this.edadPerro = edadPerro;
    }

    //Métodos propios
    public void ladrar(String ladrido) {
        System.out.println(ladrido);
    }

    //Método ToString para que nos imprima los datos del perro en consola
    @Override
    public String toString() {
        return "Perro{" +
                "nombrePerro='" + nombrePerro + '\'' +
                ", razaPerro='" + razaPerro + '\'' +
                '}';
    }
}
