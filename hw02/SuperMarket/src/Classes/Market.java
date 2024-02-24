package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarcketBehaviour;
import Interfaces.iQueueBehaviour;

public class Market implements iMarcketBehaviour,iQueueBehaviour {

    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * acceptToMarket - метод, который отмечает клиента посетившего магазин
     * @param actor - участник
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }
    /**
     * acceptToMarket - метод, который отвечает за постановку клиента в очередь
     * @param actor - участник
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }
    /**
     * releaseFromMarket - метод, который отметку клиента, который покинул магазин
     * @param actor - участник
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    /**
     * update - метод, который обновляет статус
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
    /**
     * giveOrder - метод, который отмечает выдачу заказа килиенту
     * @param actor - участник
     * actor.setTakeOrder(true); - устанавливает значение isTakeOrder на true
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }
    /**
     * releaseFromQueue - метод, который отвечает за исключения клиента из очереди
     * @param actor - участник
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }
    /**
     * releaseFromQueue - метод, который отвечает за получение заказа у клиента
     * actor.setMakeOrder(true); - устанавливает значение isMakeOrder на true
     * @param actor - участник
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

}