public class Order {
    public long customerID;
    public int orderID;
    public Product [] products;
    public float totalPrice;
    public Order(long customerID , int orderID , float totalPrice , Product[]products){
        this.customerID=Math.abs(customerID);
        this.orderID=Math.abs(orderID);
        this.products= products;
        this.totalPrice = calculateTotalPrice();
    }
    public void printOrderInfo() {
        System.out.println("Order Information:");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Products:");
        for (Product product : products) {
            if (product != null) {
                System.out.println("- " + product.getName());
            }
        }
        System.out.println("Total Price: $" + totalPrice);
    }

    private float calculateTotalPrice() {
        float totalPrice = 0;
        for (Product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }
}
