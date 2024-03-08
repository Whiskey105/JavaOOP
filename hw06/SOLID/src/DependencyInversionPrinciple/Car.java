package DependencyInversionPrinciple;

public class Car implements StartEngine{
    private PetrolEngine engine;
    public Car(PetrolEngine engine) {
        this.engine = engine;
    }
    public void start() {
        this.start();
    }
}
