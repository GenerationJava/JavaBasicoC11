package Gen17052024;

public class MiExcepcion extends Exception {

    //Constructor de la excepcion que hereda de la clase padre y recibe sólo un parámetro que es el mensaje
    public MiExcepcion(String mensajeError) {
        super(mensajeError);
    }

}
