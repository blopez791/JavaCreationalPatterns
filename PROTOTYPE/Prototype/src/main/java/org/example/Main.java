package org.example;

import org.example.prototype.PriceList;
import org.example.prototype.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Lista de precios inicial
        PriceList priceList = new PriceList("Lista normal");
        List<Product> productList = List.of(new Product("Computadora",65000),
                                            new Product("Mouse", 12000),
                                            new Product("Teclado", 8000),
                                            new Product("Pantalla", 16000),
                                            new Product("Auriculares", 4000));

        priceList.setProductList(productList);
        System.out.println(priceList);

        //Segunda lista de precios con descuento
        PriceList priceList2 = (PriceList) priceList.deepClone();
        priceList2.setName("Lista VIP");

        for(Product product: priceList2.getProductList()){
            product.setPrice(product.getPrice()*0.9);
        }

        System.out.println(priceList2);
    }
}