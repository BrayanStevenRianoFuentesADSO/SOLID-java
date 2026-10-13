
package model;

public class Order {
    private String id;
    private double amount;
    
    public Order(String pId, double pAmount){
        id= pId;
        amount=pAmount;
    }
    
    public String getId(){
        return id;
    }
    
    public double getAmount(){
        return amount;
    }
}
