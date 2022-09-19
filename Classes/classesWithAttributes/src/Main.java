public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product._id = 1;
        product.setName("Laptop");
        product.setDescription("Asus Vivobook S14 Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }

}
