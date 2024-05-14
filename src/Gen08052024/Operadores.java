package Gen08052024;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        //Gen08052024.Operadores aritméticos
        //Declaración de variables
        int numeroUno;
        int numeroDos;
        double resultado;

        //Creo la instancia de Scanner a la que llamo sc
        Scanner abuelitaNintendera = new Scanner(System.in);

        //Inicializalimos nuestras variables numéricas
        System.out.println("Ingresa el primer número");
        numeroUno = Integer.parseInt(abuelitaNintendera.nextLine());

        System.out.println("Ingresa el segundo número");
        numeroDos = Integer.parseInt(abuelitaNintendera.nextLine());

        System.out.println("Tus números de la suerte son " + numeroUno + " y " + numeroDos);

        /**
        //SUMA
        resultado = numeroUno + numeroDos;
        System.out.println("El resultado de la suma es = " + resultado);

        //RESTA
        resultado = numeroDos - numeroUno;
        System.out.println("El resultado de la resta es = " +  resultado);

        //MULTIPLICACIÓN
        resultado = numeroDos * numeroUno;
        System.out.println("El resultado de la multiplicación = " + resultado);

        //DIVISIÓN
        resultado = (double) numeroDos / numeroUno;
        System.out.println(resultado);


        //Gen08052024.Operadores Relacionales
        // IGUAL A
        boolean esIgual = numeroUno == numeroDos;
        System.out.println("La comparación resultó en " + esIgual);

        // ES DISTINTO DE
        boolean esDistinto = numeroUno != numeroDos;
        System.out.println("Son distintos? " + esDistinto);

        // MAYOR QUE, MAYOR O IGUAL >=
        boolean esMayor =  numeroDos > numeroUno;
        System.out.println("Es mayor? " + esMayor);

        // MENOR QUE, MENOR O IGUAL <=
        boolean esMenor =  numeroDos < numeroUno;
        System.out.println("Es menor? " + esMenor);


        //Asignación
        System.out.println("Indique el valor del número 3");
        int numeroTres = Integer.parseInt(abuelitaNintendera.nextLine());
        numeroTres += numeroUno;
        System.out.println("El resultado de el operador de asignación es " + numeroTres);

        // Incremento y decremento
        numeroTres = ++numeroUno;
        System.out.println("El resultado del incremento es = " + numeroTres);
        /*****/

        //Gen08052024.Operadores lógicos
        // Y lógico &&
        // O lógico ||
        // NOT !
        System.out.println("Introduce un nombre");
        String nombreUno = abuelitaNintendera.nextLine();
        System.out.println("Introduce otro nombre");
        String nombreDos = abuelitaNintendera.nextLine();

        boolean expresionUno = nombreUno.equals(nombreDos);
        // El método equals, permite comparar string
        boolean expresionDos = numeroUno == numeroDos;

        // &&: V + V = V - V + F = F - F + V = F - F + F = F
        // ||: V + V = V - V + F = V - F + V = V - F + F = F


        if ((expresionUno && expresionDos)) {
            System.out.println("Esta comparación es igual");
        } else {
            System.out.println("Esto no es igual");
        }


        // Para que el Y lógico evalúe true, ambas expresiones deben ser verdaderas
        // Para que el O lógico evalúe true, sólo requiero que una de las expresiones sea verdadera
        System.out.println("El resultado es " + expresionUno);



















        /*
        numeroUno = numeroUno + numeroDos * numeroUno;
        System.out.println(numeroUno);*/





    }

}
