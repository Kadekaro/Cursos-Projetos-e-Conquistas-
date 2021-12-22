package metodosEmJAVA.PrimeiroDesafio;

public class Mensagem {
    public static void mostrarMensagens(int hora){
        switch (hora) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> mensagemDaManha();
            case 13, 14, 15, 16, 17, 18 -> mensagemDaTarde();
            case 19, 20, 21, 22, 23 -> mensagemDaNoite();
        }
    }
        public static void mensagemDaManha(){
            System.out.println("Bom Dia");
        }
        public static void mensagemDaTarde(){
            System.out.println("Boa Tarde");
        }
        public static void mensagemDaNoite(){
            System.out.println("Boa Noite");
        }
}
