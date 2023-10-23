package br.com.fiap.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestFileAccess {
    public static void main(String[] args) {
        String fileName = "products_stock.csv";
        String directory = System.getProperty("user.home");
        String path = directory + "/" + fileName;

        List<String> products = new ArrayList<>();
        products.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade;");
        products.add("Uva; 300; pct; R$ 8.50;");
        products.add("Kiwi; 600; cx; R$ 11.20;");
        products.add("Melancia; 220; un; R$ 6.00;");

//        recordFile(fileName, path, products);

        readFile(path);
    }

    private static void recordFile(String fileName, String path, List<String> products) {
        FileWriter stream;
        PrintWriter print;

        try {
//            stream é uma conexão de escrita para o aqrquivo
            stream = new FileWriter(path);
//            a class PrintWriter escreverá no arquivo
            print = new PrintWriter(stream);
            for (String line : products) {
//                o método println escreve uma linha no arquivo
                print.println(line);
            }
//            close, fecha o arquivo
            print.close();
            stream.close();

            System.out.println("O arquivo " + fileName + "foi salvo em " + path);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(String path) {
        try {
//        Abre o arquivo
            FileReader stream = new FileReader(path);

//        BufferedReader possui o método readLine()
//        Lê uma linha do arquivo e retorna uma String com o valor lido ou null
            BufferedReader reader = new BufferedReader(stream);

//        Lê uma linha do arquivo
            String line = reader.readLine();

//        Enquanto a linha for diferente de null
            while (line != null) {

                System.out.println(line);
//            Lê a próxima linha do arquivo
                line = reader.readLine();
            }
            reader.close();
//        Fecha o arquivo
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
