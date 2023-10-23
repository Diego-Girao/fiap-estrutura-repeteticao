package br.com.fiap.collection;

import java.util.ArrayList;

public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList chart = new ArrayList();
        Double value = 100.55;
        int value2 = 1;
        int value3;

        chart.add(value);
        chart.add("Joey");
        chart.add(value2);

        System.out.println(chart.get(0));
        System.out.println(chart.get(1));
        System.out.println(chart.get(2));
    }
}
