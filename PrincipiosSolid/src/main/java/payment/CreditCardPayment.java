
package payment;


public class CreditCardPayment implements  PaymentMethod{
    
    public CreditCardPayment(){
        
    }
    
    public void pay(double pAmount){
        System.out.println("Pagando con tarjeta de credito: $"+pAmount);
    }
    
}
