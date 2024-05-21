public class enfermedades {

    {System.out.print("A ");}

    public enfermedades() {
        System.out.print("B ");
    }
}
class gripe extends enfermedades{
    static {
        System.out.print("C ");
    }
    public gripe() {
        System.out.print("D ");
    }
    {
        System.out.print("E " );
    }
    static {
        System.out.print("F ");
    }
}
class fiebre extends gripe {
    public static void main(String[] args) {
        System.out.print("G ");
        new fiebre();
        System.out.print("H ");

        int x = 5;
        int y = 10;
        int z = 0;

        z = ++x + y;
        System.out.println(z);
        System.out.println(x);
    }
}