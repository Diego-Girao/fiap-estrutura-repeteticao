package br.com.fiap.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        //        Exemplo 3
        ArrayList chart = new ArrayList();
        Double value = 100.55;
        int value2 = 1;
        int value3;

        chart.add(value);
        chart.add("Joey");
        chart.add(value2);

        System.out.println(chart.get(1));

        value3 = (int) chart.get(2);
        System.out.println(value3);

        //        Exemplo 2
//        List<String> chart = new ArrayList<String>();
//
//        System.out.println(chart.isEmpty());
//
//        chart.add("Joey");
//        chart.add("Ross");
//        chart.add("Joey");
//        chart.set(1, "Chandler");
//
//        System.out.println(chart.isEmpty());
//        System.out.println(chart.size());

        //        Exemplo 1
//        ArrayList chart = new ArrayList();
//        Double value = 100.55;
//        int value2 = 1;
//        int value3;
//
//        chart.add(value);
//        chart.add("Joey");
//        chart.add(value2);
//
//        System.out.println(chart.get(0));
//        System.out.println(chart.get(1));
//        System.out.println(chart.get(2));
    }
}
