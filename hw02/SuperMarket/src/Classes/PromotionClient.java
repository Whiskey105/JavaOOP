package Classes;

/**
 * PromotionClient класс наследник Actor, отвечает за клиентов - участников промоакакции
 */
public class PromotionClient extends Actor {

    /**
     * @param name - Имя клиента
     * @param idPromoClient - идентификационный номер клиента
     * @param promoActorAmount - статическое значение количесва участников промо акции
     */
    private int idPromoClient;
    private String promoName;
    private static int promoActorAmount;



    public PromotionClient (String name, int idPromoClient)
    {
        super(name);
        this.idPromoClient = idPromoClient;
        promoActorAmount += 1;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    public Actor getActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

}
