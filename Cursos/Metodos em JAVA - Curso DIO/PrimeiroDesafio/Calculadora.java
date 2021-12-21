package metodosEmJAVA.PrimeiroDesafio;

public class Calculadora {

    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("O valor da soma entre o {" + numero1 + "}, mais o {" + numero2 + "}, será de: " + resultado + "!");
    }

    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("O valor da subtração entre o {" + numero1 + "}, menos o {" + numero2 + "}, será de: " + resultado + "!");
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("O valor da multiplicação entre o {" + numero1 + "}, vezes o {" + numero2 + "}, será de: " + resultado + "!");
    }

    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("O valor da divisão entre o {" + numero1 + "}, dividido pelo {" + numero2 + "}, será de: " + resultado + "!");
    }
}

