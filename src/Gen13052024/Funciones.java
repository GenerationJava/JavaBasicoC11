package Gen13052024;

import java.util.Scanner;

public class Funciones {
    //Función y método, se usan de manera intercambiable, método se utiliza cuando se refiere a una función propia de una clase
    //La declaraciones de los demás metodos las hacemos fuera del main, podemos llamar a los métodos dentro de otros pero no declararlos

    //La sintaxis de un método en Java lleva lo siguiente
    /** modificador-de-acceso   palabra-reservada-static   tipo-dato-o-void (tipoDatoParámetro nombreParámetro) {
     Cuerpo del Método
     Si tiene retorno, debe llevar la palabra reservada return datoARetornar
    }*/

    //Declaramos los métodos
    public static void imprimir() {
        //Esté método llama a la clase System y a su método println()
        System.out.println("Hola mundo");
    }

    public static void imprimir(String cohorte) {
        //Esté método llama a la clase System y a su método println()
        System.out.println("Hola mundo, esta es la cohorte " + cohorte);
    }

    public static void imprimir(Integer numeroParticipantes) {
        //Esté método llama a la clase System y a su método println()
        System.out.println("Hola mundo, esta cohorte tiene " + numeroParticipantes + " participantes");
    }
    public static void imprimir(Double promedioCohorte) {
        //Esté método llama a la clase System y a su método println()
        System.out.println("Hola mundo, esta cohorte obtuvo un promedio de " + promedioCohorte);
    }

    //Métodos para realizar las operaciones aritméticas

    public static Integer suma(Integer numero1, Integer numero2) {
        Integer resultado = numero1 + numero2;
        return resultado;
    }

    public static Integer suma(Integer numero1, Integer numero2, Integer numero3) {
        Integer resultado = numero1 + numero2 + numero3;
        return resultado;
    }

    public static Integer resta(Integer numero1, Integer numero2) {
        Integer resultado = numero1 - numero2;
        return resultado;
    }

    public static Integer multiplicacion(Integer numero1, Integer numero2) {
        Integer resultado = numero1 * numero2;
        return resultado;
    }

    public static Integer division(Integer numero1, Integer numero2) {
        Integer resultado = numero1 / numero2;
        return resultado;
    }


    //Método con retorno
    public static String fraseSaludo(String nombre) {
        return "hola " + nombre;
    }

    //Sobrecarga de métodos, nos permite agregar más argumentos y trabajar con otros tipos de dato
    public static String fraseSaludo(String nombre, Integer edad) {
        return "hola " + nombre + ", tienes " + edad + " años";
    }

    //Método sin retorno
    public static void saludar() {
        Scanner inputUsuario = new Scanner(System.in);

        //Este método comienza solicitando el nombre
        System.out.println("Dime tu nombre");
        //Lo guarda en una variable
        String nombre = inputUsuario.next();
        //Imprime el nombre el consola, llamando al método fraseSaludo()
        System.out.println(fraseSaludo(nombre));
    }




    //El método main, es una función que la JVM va a buscar como punto de entrada a nuestro programa
    public static void main(String[] args) {
        saludar();

        System.out.println("El resultado de la operación con 3 numeros es " + suma(5,5,1));
        System.out.println("El resultado de la operación con 2 numeros es " + suma(5,5));

        //Se puede trabajr con el valor que retorna un método
        String saludo = fraseSaludo("Marcia", 29);
        System.out.println(saludo);
    }
}
