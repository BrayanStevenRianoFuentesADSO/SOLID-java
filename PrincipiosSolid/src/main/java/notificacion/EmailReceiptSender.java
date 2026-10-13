
package notificacion;

import model.Order;


public class EmailReceiptSender implements ReceiptSender {
    public EmailReceiptSender(){
        
    }
    
    public void sendReceipt(Order order){
        System.out.println("Enviado por email para la orden: "+order.getId());
    }
}
