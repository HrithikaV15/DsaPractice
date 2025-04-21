public class Product {
    private Long id;
    private String name;
    private Double price;

    public Product(Long id, String name, Double price) {
        this.id = id;
        setName(name);
        setPrice(price);
    }

    public Product(String name,Double price){
        this(null,name,price);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        if(name.isBlank() || name.length() > 20){
            this.name="Default name";
        } else {
            this.name = name;
        }
    }


    private Double getPrice() {
        return price;
    }


    private void setPrice(Double price) {
        if (price==0 || price<0){
            this.price = 100.0;
        } else {
            this.price=price;
        }

    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
