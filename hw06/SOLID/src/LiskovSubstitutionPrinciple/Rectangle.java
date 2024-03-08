package LiskovSubstitutionPrinciple;

public class Rectangle extends Square{
    private int height;

    public Rectangle(int width, int height) {
        super(width);
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public int area() {
        return super.width * this.height;
    }

    public int getHeight() {
        return height;
    }
}
