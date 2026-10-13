
package payment;


public class PayPalPayment implements PaymentMethod{
    public PayPalPayment(){
        
    }
    
    public void pay(double pAmount){
        System.out.println("Pagando con Paypal: $"+pAmount);
    }
}
