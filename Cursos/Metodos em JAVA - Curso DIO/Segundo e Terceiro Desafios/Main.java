public class Main {
    public static void main(String[] args) {

        // Sem retorno
        System.out.println("\nMétodo sem retorno sobrecarregado:");
        Quadrilateros.area(3);
        Quadrilateros.area(4, 5);
        Quadrilateros.area(8, 9, 5.5);



        // Com retorno

        System.out.println("\nMétodo com retorno sobrecarregado:");
        double quadrado = QuadrilaterosComRetorno.area(5);
        double retangulo = QuadrilaterosComRetorno.area(5 , 6);
        double trapezio = QuadrilaterosComRetorno.area(5, 6 ,7);

        System.out.println("\nA área do quadrado é: " + (quadrado) + " cm²");
        System.out.println("A área do retângulo é: " + (retangulo) + " cm²");
        System.out.println("A área do trapézio é: " + trapezio + " cm²");
    }
}
