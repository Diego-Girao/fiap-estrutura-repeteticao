package br.com.fiap.arrays;

public class ProductsArrays {
    public static void main(String[] args) {
        Products[] products = new Products[2];

        Products products1 = new Products();
        products1.setName("Limão");
        products1.setDescription("Galego");
        products1.setValue(5);

        Products products2 = new Products();
        products2.setName("Kiwi");
        products2.setDescription("Nanico");
        products2.setValue(2);

        products[0] = products1;
        products[1] = products2;

        // Utilizando o for de maneira convencional
//        for (int i = 0; i < products.length; i++) {
//            System.out.println(products[i].toString());
//        }

        // Utilizando o foreach
//        for (Products prod : products) {
//            System.out.println(prod.toString());
//        }
        Products[][] locationProduct = new Products[10][3];

        locationProduct[0][1] = products1;
        locationProduct[1][1] = products2;

        System.out.println(locationProduct[0][1].getName());
        System.out.println(locationProduct[1][1].getName());
    }
}
