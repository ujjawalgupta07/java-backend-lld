package DesignPatterns.Builder;

public class Client {

    public static void main(String[] args) {
        Product product = Product.getBuilder().setProductCategory("Shirt").setProductName("p1").build();
        System.out.println(product.getProductCategory());
    }
}
