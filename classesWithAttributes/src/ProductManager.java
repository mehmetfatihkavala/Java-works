public class ProductManager {
    public void Add(Product product){
        System.out.println("Ürün eklendi " + product.get_name());
        System.out.println(product.get_kod());

    }
}
