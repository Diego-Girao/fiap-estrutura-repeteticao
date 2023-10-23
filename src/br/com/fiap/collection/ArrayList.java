package br.com.fiap.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayList {
    public static void main(String[] args) {
        //  Exemplo2
        Set<String> basket = new HashSet<String>();

        System.out.println(basket.isEmpty());
        basket.add("Uva");
        basket.add("Uva");
        basket.add("uva");
        System.out.println(basket.isEmpty());

        System.out.println(basket.size());
        System.out.println(basket);

        // Exemplo 1
//        List<String> chart = new java.util.ArrayList<String>();
//
//        chart.add("Vikings");
//        chart.add("The Walking Dead");
//        chart.add("Vikings");
//
//        System.out.println(chart.contains("Vikings"));
//        System.out.println(chart.indexOf("Vikings"));
//        System.out.println(chart.get(chart.indexOf("Vikings")));
//        System.out.println(chart.lastIndexOf("Vikings"));
//
//        chart.remove(chart.indexOf("Vikings"));
//        System.out.println(chart.get(0));
//
//        chart.clear();
//        System.out.println(chart.isEmpty());
    }
}
