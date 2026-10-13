
package servicio;

import model.Order;
import notificacion.ReceiptSender;
import payment.PaymentMethod;


public class OrderProcessor {
    private final PaymentMethod paymentmethod;
    private final ReceiptSender receiptsender;
    
    public OrderProcessor(PaymentMethod pPaymentMethod, 
            ReceiptSender pReceiptSender){
        paymentmethod = pPaymentMethod;
        receiptsender= pReceiptSender;
    }
    
    public void process(Order order){
        System.out.println("Procesando orden ["+order.getId()+"]");
        paymentmethod.pay(order.getAmount());
        receiptsender.sendReceipt(order);
        System.out.println("orden procesada correctamente.");
        
    }
}
