
package notificacion;

import model.Order;

public interface ReceiptSender {
    void sendReceipt(Order pValue);
}
