package br.com.fiap.estrutura.repeticao;

public class UseWhile {
    public static void main(String[] args) {
        int items = 10;
        int register = 0;

        while (register < items) {
            register++;

            System.out.println("O produto número " + register + " foi registrado com sucesso!");
        }
    }
}
