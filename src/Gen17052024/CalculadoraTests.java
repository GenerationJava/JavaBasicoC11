package Gen17052024;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//Clase que recopila los tests unitarios de la calculadora
public class CalculadoraTests {

    private Calculadora calculadora;

    //Esta anotación va a ejecutar el test del método que se indique antes de todo lo demás
    @BeforeEach
    void setup() {
        //Inicializar mi calculadora
        calculadora = new Calculadora();
    }

    @Test
    void pruebaUnitariaSuma() {
        //Confirmamos que el resultado de la suma nos dé una cantidad fija
        //Assertions o afirmaciones
        //En assertEquals, mandamos como argumento, primero el resultado esperado y luego el método que vamos a probar
        assertEquals(10,calculadora.suma(5,5));
    }

    @Test
    void pruebaUnitariaResta() {
        assertEquals(5, calculadora.resta(10,4), "10 - 5 debería resultar en 5");
    }

    @Test
    @DisplayName("Prueba de multiplicación")
    void pruebaUnitariaMultiplicacion() {
        assertEquals(25, calculadora.multiplicacion(5,5), "5 * 5 debería resultar en 25");
    }

    @Test
    @DisplayName("Prueba de división")
    void pruebaUnitariaDivision() {
        //Esta prueba pasa porque estamos comprobando que al dividir entre 0 arroje una excepción
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> {calculadora.division(5,0);
        });

    }





}
