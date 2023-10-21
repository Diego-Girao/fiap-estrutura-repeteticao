package br.com.fiap.arrays;

public class StringExample {
    public static void main(String[] args) {
//        String name;
//        name = new String();
//        name = "Joey";
//        System.out.println(name);
//
//        String name2 = new String("Ross");
//        System.out.println(name2);
//
//        String name3 = "Chandler";
//        System.out.println(name3);

        /*
        Concatenando  Strings de 3 formas diferentes
        * */

        String name = new String("Joey,");
        String description = new String();
        description = "é o personagem mais engraçado, de todos os Friends";

        String merchan = name + " " + description;
        System.out.println(merchan);

        merchan = name.concat(" ").concat(description);
        System.out.println(merchan);

        merchan += "!";
        System.out.println(merchan);
    }
}

