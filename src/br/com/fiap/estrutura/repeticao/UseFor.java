package br.com.fiap.estrutura.repeticao;

public class UseFor {
    public static void main(String[] args) {
        int items = 10;
        int register = 0;

        //Iniciando o contador zerado
        for (int i = 0; i < items; i++) {
            System.out.println("O caixa registrou o produto " + i);
        }
//        //Iniciando o contador a partir 1
//        for (int i = 1; i <= items; i++) {
//            System.out.println("O caixa registrou o produto " + i);
//        }
    }
}
