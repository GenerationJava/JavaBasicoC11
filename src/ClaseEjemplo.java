import java.util.Scanner;

// Java es un lenguaje basado en clases
// Declaración de la clase ClaseEjemplo, lleva un modificador de acceso, la palabra reservada class y el nombre de la clase
public class ClaseEjemplo {

    public int sumar(int numA, int numB) {
        int resultado = numA + numB;
        return resultado;
    }

    public static int resta(int numA, int numB) {
        int resultado = numA - numB;
        return resultado;
    }


    // El método main es el punto de entrada a nuestro programa
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Este es el primer programa de la cohorte");
        // El System.out.println va a ser el símil del console.log()

        Scanner sc = new Scanner(System.in);
        // La clase Scanner se usa para recibir datos a través de la consola
        System.out.println("Escribe tu nombre");

        String nombre = sc.nextLine();
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Ahora ingresa tu edad");

        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Te llamas "
                            + nombre + ", tu edad es " + edad);

        System.out.println("Ingresa tu apellido");
        String apellido = sc.nextLine();
        System.out.println("Tu nombre es " + nombre + " " + apellido);

        sc.close();

    } // Acá se termina el scope del método main


} // Acá se termina el scope de la clase