

package com.mycompany.principiossolid;

import model.Order;
import notificacion.EmailReceiptSender;
import notificacion.ReceiptSender;
import payment.CreditCardPayment;
import payment.PayPalPayment;
import payment.PaymentMethod;
import servicio.OrderProcessor;


public class PrincipiosSolid {

    public static void main(String[] args) {
        System.out.println("Trabajando con principios solid");
        
        Order orden1= new Order("ORD-01", (double)150);
        Order orden2= new Order("ORD-02", (double)75);
        
        ReceiptSender emailNotifier = new EmailReceiptSender();
        
        PaymentMethod creditCard=new CreditCardPayment();
        
        OrderProcessor processor1=new OrderProcessor(creditCard, emailNotifier);
        
        processor1.process(orden1);
        
        PaymentMethod PayPal=new PayPalPayment();
        
        OrderProcessor processor2 = new OrderProcessor(PayPal, emailNotifier);
        
        processor2.process(orden2);
    }
}
