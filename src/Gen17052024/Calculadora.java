package Gen17052024;

import java.util.List;

public class Calculadora {

    public Integer suma(Integer a, Integer b) {
        return a + b;
    }

    public Integer resta(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiplicacion(Integer a, Integer b) {
        return a * b;
    }

    public Integer division(Integer a, Integer b) throws MiExcepcion {

        /**Solucion Benja Gonzalez
        try {
            if (a == 0 || b == 0) {
                throw new MiExcepcion("La división por cero no está permitida");
            }
            return a/b;
        } catch (MiExcepcion e) {
            e.printStackTrace();
            return null;
        }**/

         try {
            return a/b;
             //Si esto falla, se dirige al bloque catch
         } catch (ArithmeticException e) {//En el catch indicamos el tipo de excepción que se va a atrapar
            throw new ArithmeticException();
         }
    }


    public static void realizarDivision() throws MiExcepcion {
        throw new MiExcepcion("Hola, este es el mensaje");
    }

    public static void main(String[] args) throws MiExcepcion {
        Calculadora miCalculadora = new Calculadora();


        System.out.println(miCalculadora.suma(0,10));
        System.out.println(miCalculadora.resta(10,5));
        System.out.println(miCalculadora.multiplicacion(5,5));
        System.out.println(miCalculadora.division(5,0));
        System.out.println();

    }


}
