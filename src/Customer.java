public class Customer {
    public long customerID;
    public String name;
    public String address;
    public Customer(long customerID , String name , String address){
        this.customerID= Math.abs(customerID);
        this.name=name;
        this.address=address;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setCustomerID(long customerID){
        this.customerID=Math.abs(customerID);
    }
    public long getCustomerID(){
        return customerID;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
}
