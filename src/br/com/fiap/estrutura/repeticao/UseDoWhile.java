package br.com.fiap.estrutura.repeticao;

public class UseDoWhile {
    public static void main(String[] args) {
        int items = 10;
        int register = 0;

        do {
            register++;
            System.out.println("Foi registrado o produto " + register);
        } while (register < items);
    }
}
