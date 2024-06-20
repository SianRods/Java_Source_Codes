public class Product {
    private double price ;
    private String name ;
    private int quantity;
    
    public Product(String initialName, double initialPrice, int initialQuantity){
        this.price=initialPrice;
        this.name=initialName;
        this.quantity=initialQuantity;
    }

    public void printProduct(){
        System.out.println(name+",price "+price+","+quantity+"pcs");
    }
}
