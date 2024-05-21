package gen16052024.models;

//Esta interfaz es abstracta porque define métodos en común para todas las clases específicas que la implementen
public interface Animal {

    //Con final indicamos que un atributo o variable es una constante
    final Boolean estaVivo = true;

    //Acá vamos a utilizar polimorfismo, porque con cada clase específica va a ejecutar estos métodos de distintas formas
    String vocalizar();
    String alimentarse();
    String reproducirse();


}
