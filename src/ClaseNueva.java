import java.util.Scanner;

public class ClaseNueva {


    public static void main(String[] args) {


        System.out.println("Este es otro programa distinto");

        Scanner miPrimerScanner = new Scanner(System.in);
        System.out.println("Oye, por favor indica tu edad");
        int edad = miPrimerScanner.nextInt();
        System.out.println("Eres muy menor" + " tienes " + edad);
    }

}
