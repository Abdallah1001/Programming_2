import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElectronicProduct electronicProduct = new ElectronicProduct(1,"smartphone", 599.99f , "Samsung", 1);

        ClothingProduct clothingProduct = new ClothingProduct(2,"T-shirt",19.99f,"Medium","Cotton");

        BookProduct bookProduct = new BookProduct(3,"OOP",39.99f,"O'Reilly","X Publications");
        System.out.println("Welcome to E-commerce System");
        System.out.print("Enter your customer ID: ");
        long customerId = Math.abs(scanner.nextLong());
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(customerId, name, address);
        System.out.print("How many products you want to add to your cart? ");
        int nProducts = Math.abs(scanner.nextInt());
        scanner.nextLine();
        Cart cart = new Cart(customer.getCustomerID(), nProducts);
        for (int i = 0; i < nProducts; i++) {
            System.out.println("Choose product type:");
            System.out.println("1. Electronic");
            System.out.println("2. Clothing");
            System.out.println("3. Book");
            int productType = scanner.nextInt();
            scanner.nextLine();
            Product product = null ;
            switch (productType) {
                case 1:
                    product = new ElectronicProduct(electronicProduct.productID, electronicProduct.name,electronicProduct.price,electronicProduct.brand,electronicProduct.warrantyPeriod);
                    break;
                case 2:
                    product = new ClothingProduct(clothingProduct.productID, clothingProduct.name, clothingProduct.price, clothingProduct.size, clothingProduct.fabric);
                    break;
                case 3:
                    product = new BookProduct(bookProduct.productID, bookProduct.name, bookProduct.price, bookProduct.author, bookProduct.publisher);
                    break;
                default:
                    product = new Product(productType, product.name, product.price);
                    break;
            }
            cart.addProduct(product, i);
        }
        System.out.print("Your total is " +cart.calculatePrice()+" . Would you like to place the order ? 1-Yes 2-No");
        String placeOrder = scanner.nextLine();
        if (placeOrder.equalsIgnoreCase("Yes")) {
            Order order = new Order(customer.getCustomerID(), 1, cart.calculatePrice(), cart.getProducts());
            order.printOrderInfo();
            cart.placeOrder();
        } else {
            System.out.println("Order placement canceled.");
        }
        scanner.close();
        System.out.println("Here's your order's summary :");
        System.out.println("Order ID : 1");
        System.out.println("Customer ID : "+customerId);
        System.out.println("Products : ");
        System.out.println(Arrays.toString(cart.products));
        System.out.println("Total price : "+cart.calculatePrice());
    }
    }