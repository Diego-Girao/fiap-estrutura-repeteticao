package br.com.fiap.collection;

import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        // Exemplo 3
        Map<String, String> operator = new HashMap<String, String>();
        operator.put("M1001", "John");
        operator.put("M1002", "Ana");
        operator.put("M1003", "Mike");

        System.out.println(operator.isEmpty());
        System.out.println(operator.size());
        System.out.println(operator.containsKey("OP1001"));
        System.out.println(operator.containsValue("John"));
        System.out.println(operator);

        //  Exemplo 2
//        Set<String> basket = new HashSet<String>();
//
//        System.out.println(basket.isEmpty());
//        basket.add("Uva");
//        basket.add("Uva");
//        basket.add("uva");
//        System.out.println(basket.isEmpty());
//
//        System.out.println(basket.size());
//        System.out.println(basket);

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
