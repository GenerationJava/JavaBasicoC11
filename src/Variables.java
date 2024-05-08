public class Variables {

    public static void main(String[] args) {

        // Tipos de dato primitivo en Java
        byte numeroMuyPequenio = 127; // -128 a 127
        short numeroPequenio = -32765; // 2bits -32768 a 32767
        int entero = -2147483647; //-2,147,483,648 to 2,147,483,647
        long numeroMasGrande = -9223372036854775808L;// -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        /** Los datos numéricos vienen por defecto como int y podemos castearlos de manera implícita o explícita
         int numeroConDecimal = (int) 3.9;
         System.out.println(numeroConDecimal); **/
        float decimalConMenosDigitos = (float) 3.14; // 7 decimales
        double numeroDecimal = 3.14; // 16 decimales
        char caracter = '\'';
        boolean condicion = true; // Verdadero o falso

        // Datos tipo objeto, wrapper
        Integer enteroObjeto = 10;


    }
}
