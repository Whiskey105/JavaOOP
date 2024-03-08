package LiskovSubstitutionPrinciple;

public class Square{

    protected int width;

    public Square(int width) {
        this.width = width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return this.width * this.width;
    }

    public int getWidth() {
        return width;
    }
}
