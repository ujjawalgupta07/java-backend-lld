package DesignPatterns.Builder;


public class Product {

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String productName;
    public int productPrice;
    public String productDescription;
    public String productCategory;

    private Product(ProductBuilder builder) {
            this.productName = builder.productName;
            this.productCategory = builder.productCategory;
            this.productDescription = builder.productDescription;
            this.productPrice = builder.productPrice;
    }

    public static ProductBuilder getBuilder(){
        return new ProductBuilder();
    }

    public static class ProductBuilder {

        private String productName;
        private int productPrice;
        private String productDescription;
        private String productCategory;

        public String getProductName() {
            return productName;
        }

        public ProductBuilder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public int getProductPrice() {
            return productPrice;
        }

        public ProductBuilder setProductPrice(int productPrice) {
            this.productPrice = productPrice;
            return this;
        }

        public String getProductDescription() {
            return productDescription;
        }

        public ProductBuilder setProductDescription(String productDescription) {
            this.productDescription = productDescription;
            return this;
        }

        public String getProductCategory() {
            return productCategory;
        }

        public ProductBuilder setProductCategory(String productCategory) {
            this.productCategory = productCategory;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

    }
}
