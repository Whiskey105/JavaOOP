package Classes;

public abstract class Actor {
    /**
     * Родительский класс для участников обмена
     * @param name - Имя клиента
     * @param isTakeOrder - логическое значечение для отображения был ли отдан заказ
     * @param isMakeOrder - логическое значечение для отображения был ли создан заказ
     */
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;


    public Actor(String name) {
        this.name = name;
    }

    abstract String getName();
    abstract  void setName(String name);
}
