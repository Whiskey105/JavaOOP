package Interfaces;

import Classes.Actor;

/**
 * Интерфейс для обработки возврата
 *  setReturnReason устанавливает прчину возврата
 *  getOrderId получает номер заказа
 *  setReturnId устанавливет номер возврата
 */
public interface iReturnOrder {


    public Actor getActor();
    public void setReturnReason(String val);
    public int getOrderId();
    public void setReturnId();

}
