package Interfaces;

import Classes.Actor;

/**
 * iQueueBehaviour - отвечает за поведение очереди
 * takeInQueue - постановка клиента в очередь
 * releaseFromQueue - исключенеи клиента из очереди
 * takeOrder - получение заказа от клиента
 * giveOrder - выдача заказа клиенту
 */
public interface iQueueBehaviour {
    public void takeInQueue(iActorBehaviour actor);
    public void releaseFromQueue();
    public void takeOrder ();
    public void giveOrder ();
    // public void getActor ();
}