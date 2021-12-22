public class Quadrilateros {
    public static void area(double a){
        System.out.println("\nA área do quadrado é: " + (a*a) + " cm²");
    }
    public static void area(double a, double b){
        System.out.println("A área do retângulo é: " + (a * b) + " cm²");
    }
    public static void area(double a, double b, double altura){
        System.out.println("A área do trapézio é: " + ((a+b)*altura)/2 + " cm²");
    }
}

