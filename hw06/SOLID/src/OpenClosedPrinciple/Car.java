package OpenClosedPrinciple;

public class Car extends Vehicle{
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double getMaxSpeed()
    {
        return this.maxSpeed * 0.8;
    }
}
