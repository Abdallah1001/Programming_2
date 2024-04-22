public class Product {
    public int productID;
    public String name;
    public float price;

    public Product(int productID , String name , float price){
        this.productID=Math.abs(productID);
        this.name=name;
        this.price= Math.abs(price);
    }
    public void setProductID(int productID){
        this.productID= Math.abs(productID);
    }

    public int getProductID(){
        return productID;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(float price){
        this.price = Math.abs(price);
    }
    public float getPrice(){
        return price;
    }
}
