package Classes;

/**
 * PromotionClient класс наследник Actor, отвечает за клиентов со спецусловиями
 */
public class SpecialClient extends Actor {
    /**
     * @param idVIP - уникальный номер спецклиента
     *
     */
    private int idVIP;

    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
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