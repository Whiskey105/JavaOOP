package Domain;

public class Bottle extends Product{

    private double volume;
    public Bottle(long id, String name, double price, int place, double volume) {
        super(id, name, price, place);
        this.volume = volume;

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return "Bottle [" +
                "volume=" + volume +
                "] " + super.toString();
    }
}
