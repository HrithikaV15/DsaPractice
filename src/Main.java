public class Main {
    public static void main(String[] args) {
        ProductDB db= new ProductDB();
        Product product=new Product("pen",19.0);
        System.out.println(product);
        product=db.saveProduct(product);
        System.out.println(product);

    }
}