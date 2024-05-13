public class Main {

    public static void main(String[] args) {
    Product product = new Product(2,"Laptop","Lenovo laptop",7000,5000);
    // product.set_name("Laptop");
    // product.set_description("Lenovo laptop");
    // product.setId(2);
    // product.set_price(7000);
    // product.set_stockAmount(5000); //Bunlarla çalışınca yapıcı bloktaki thisler silinebilir.

    ProductManager productManager = new ProductManager();
    productManager.Add(product);
    }
}
