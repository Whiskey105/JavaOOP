package OpenClosedPrinciple;

public class Bus extends Vehicle{
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double getMaxSpeed() {
        return this.maxSpeed * 0.6;
    }
}
