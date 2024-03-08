import LiskovSubstitutionPrinciple.Rectangle;
import LiskovSubstitutionPrinciple.Square;
import OpenClosedPrinciple.Bus;
import OpenClosedPrinciple.Car;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car(100, "Red");
        Bus bus1 = new Bus(100, "Red Bus");

        System.out.println("bus1 = " + bus1.getMaxSpeed());
        System.out.println("car1 = " + car1.getMaxSpeed());

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 4);

        System.out.println("rectangle.getWidth() = " + rectangle.getWidth());
        System.out.println("rectangle.getHeight() = " + rectangle.getHeight());
        System.out.println("rectangle.area() = " + rectangle.area());

        System.out.println("square.getWidth() = " + square.getWidth());
        System.out.println("square.area() = " + square.area());
    }
}
