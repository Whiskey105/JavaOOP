package Classes;

import Interfaces.iActorBehaviour;

/**
 * TaxInspector класс, отвечает за отдельную сущность налогвого испектора, который не будет участвовать в обмене магазина.
 * @param name - заранее устанавливается в конструкторе класса как "Tax Audit"
 */
public class TaxInspector implements iActorBehaviour {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;


    public TaxInspector() {
        this.name = "Tax Audit";
    }

    public String getName()
    {
        return name;
    }


    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        isTakeOrder = val;
    }
    public void setMakeOrder(boolean val) {
        isMakeOrder = val;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

}