package Model.Domain;

public class ComplexNumber {

    /**
     * Класс для комплексного числа
     * realPart - значение вещесвенного числа в вечественной части
     * imaginaryPart - значение вещесвенного числа в мнимой части
     */

    private float realPart;
    private float imaginaryPart;

    public ComplexNumber(float realPart, float imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber(String promptReal, String promptImaginary) {
        this.realPart = Float.parseFloat(promptReal);
        this.imaginaryPart = Float.parseFloat(promptImaginary);
    }

    public float getImaginaryPart() {
        return imaginaryPart;
    }

    public float getRealPart() {
        return realPart;
    }

    @Override
    public String toString() {
        String line;
        if (imaginaryPart <= 0)
        {
            line = String.format("%4.2f%4.2fi",realPart, imaginaryPart);
        } else if (realPart <= 0) {
            line = String.format("(%4.2f+%4.2fi)",realPart, imaginaryPart);
        } else if (imaginaryPart <= 0 && realPart <= 0) {
            line = String.format("(%4.2f%4.2fi)",realPart, imaginaryPart);
        } else {
            line = String.format("%4.2f+%4.2fi",realPart, imaginaryPart);
        }
        return  line;
    }

}
