package metodosEmJAVA.PrimeiroDesafio;

public class ChamadadosMetodos {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("\nMostrando os resultados da Calculadora!");
        Calculadora.soma(3.5 , 6.7);
        Calculadora.subtracao(3.9, 8.4);
        Calculadora.multiplicacao(5.8, 9.2);
        Calculadora.divisao(7.2, 9.7);

        // Mensagens
        System.out.println("\nMostrando as mensagens do dia!");
        Mensagem.mostrarMensagens(2);
        Mensagem.mostrarMensagens(13);
        Mensagem.mostrarMensagens(22);

        // Emprestimos
        System.out.println("\nMostrando os valores dos empréstimos!");
        Emprestimo.calcular(10000, 2);
        Emprestimo.calcular(10000,3);
        Emprestimo.calcular(10000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(10000, Emprestimo.getTresParcelas());

    }
}