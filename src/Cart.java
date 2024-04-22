public class Cart {
    public long customerID;
    public int nProduct;
    public Product[] products;

    public Cart(long customerID , int nProduct){
        this.customerID=Math.abs(customerID);
        this.nProduct=Math.abs(nProduct);
        this.products = new Product[nProduct];
    }
    public void setCustomerID(int customerID){
        this.customerID=Math.abs(customerID);
    }
    public long getCustomerID(){
        return customerID;
    }
    public void setnProduct(int nProduct){
        this.nProduct=Math.abs(nProduct);
    }
    public int getnProduct(){
        return nProduct;
    }
    public Product[] getProducts() {
        return products;
    }

    public void addProduct(Product product, int index) {
        if (index >= 0 && index < nProduct) {
            products[index] = product;
        } else {
            System.out.println("Invalid index for adding product to cart.");
        }
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < nProduct) {
            products[index] = null;
        } else {
            System.out.println("Invalid index for removing product from cart.");
        }
    }

    public float calculatePrice() {
        float totalPrice = 0;
        for (int i = 0 ; i<nProduct; i++){
            if (products[i] != null){
                totalPrice += products[i].getPrice();
            }
        }
        return totalPrice;
    }

    public void placeOrder() {
        if (nProduct > 0) {
            System.out.println("Order placed successfully.");
        } else {
            System.out.println("No products in the cart. Order placement failed.");
        }
    }
}
