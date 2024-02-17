package Domain;

public class HotDrink extends Product{

    private double temp;
    public HotDrink(long id, String name, double price, int place, double temp) {
        super(id, name, price, place);
        this.temp = temp;
    }


    @Override
    public String toString() {
        return "HotDrink [" +
                "temp=" + temp +
                "] " + super.toString();
    }
}
