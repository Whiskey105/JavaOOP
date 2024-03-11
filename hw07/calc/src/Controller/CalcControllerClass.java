package Controller;

import Model.Domain.ComplexNumber;

public class CalcControllerClass{
    /**
     *Класс для проведения математичсеких операций
     * sum - метод для рассчета суммы
     * subtraction - метод для рассчета разницы
     * multiplication - метод для рассчета произведения
     * division - метод для рассчета отношения
     */

    /**
     * Метод рассчитывает сумму двух комплексных чисел по формуле (a+bi) + (x+yi) = (a+x)+(b+y)i, где
     * a - firstOperand.getRealPart()
     * b - firstOperand.getImaginaryPart()
     * x - secondOperand.getRealPart()
     * y - secondOperand.getImaginaryPart()
     *
     * realPart = (a+x)
     * imaginaryPart = (b+y)
     *
     * за получение значений вещесвенных чисел отвечают методы getRealPart(вечесвенная часть) getImaginaryPart(мнимая часть)
     * @return result - Комплексное число с вещесвенной частю realPart и мнимой imaginaryPart
     */
    public static ComplexNumber sum(ComplexNumber firstOperand, ComplexNumber secondOperand){
        float realPart = firstOperand.getRealPart() + secondOperand.getRealPart();
        float imaginaryPart = firstOperand.getImaginaryPart() + secondOperand.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        return result;
    }

    /**
     * Метод рассчитывает разницу двух комплексных чисел по формуле (a+bi) - (x+yi) = (a-x)+(b-y)i, где
     * a - firstOperand.getRealPart()
     * b - firstOperand.getImaginaryPart()
     * x - secondOperand.getRealPart()
     * y - secondOperand.getImaginaryPart()
     *
     * realPart = (a-x)
     * imaginaryPart = (b-y)
     *
     * за получение значений вещесвенных чисел отвечают методы getRealPart(вечесвенная часть) getImaginaryPart(мнимая часть)
     * @return result - Комплексное число с вещесвенной частю realPart и мнимой imaginaryPart
     */

    public static ComplexNumber subtraction(ComplexNumber firstOperand, ComplexNumber secondOperand){
        float realPart = firstOperand.getRealPart() - secondOperand.getRealPart();
        float imaginaryPart = firstOperand.getImaginaryPart() - secondOperand.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        return result;
    }

    /**
     * Метод рассчитывает произведение двух комплексных чисел по формуле (a+bi) * (x+yi) = (ax-by)+(bx+ay)i, где
     * a - firstOperand.getRealPart()
     * b - firstOperand.getImaginaryPart()
     * x - secondOperand.getRealPart()
     * y - secondOperand.getImaginaryPart()
     *
     * realPart = (ax-by)
     * imaginaryPart = (bx+ay)
     *
     * за получение значений вещесвенных чисел отвечают методы getRealPart(вечесвенная часть) getImaginaryPart(мнимая часть)
     * @return result - Комплексное число с вещесвенной частю realPart и мнимой imaginaryPart
     */
    public static ComplexNumber multiplication(ComplexNumber firstOperand, ComplexNumber secondOperand){
        float realPart = firstOperand.getRealPart() *  secondOperand.getRealPart() - firstOperand.getImaginaryPart() * secondOperand.getImaginaryPart();
        float imaginaryPart = firstOperand.getRealPart() *  secondOperand.getImaginaryPart() + firstOperand.getImaginaryPart() * secondOperand.getRealPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        return result;
    }

    /**
     * Метод рассчитывает отношение двух комплексных чисел по формуле (a+bi) / (x+yi) = (ax+by)/(x^2*y^2)+(bx-ay)(x^2*y^2)i, где
     * a - firstOperand.getRealPart()
     * b - firstOperand.getImaginaryPart()
     * x - secondOperand.getRealPart()
     * y - secondOperand.getImaginaryPart()
     *
     * realPartNumerator = (ax+by)
     * imaginaryPartNumerator = (bx-ay)
     * denominator = (x^2*y^2)
     *
     * realPartResult - вещественная часть результата
     * imaginaryPartResult - минимая часть результата
     *
     * за получение значений вещесвенных чисел отвечают методы getRealPart(вечесвенная часть) getImaginaryPart(мнимая часть)
     * @return result - Комплексное число с вещесвенной частю realPart и мнимой imaginaryPart
     */

    public static ComplexNumber division(ComplexNumber firstOperand, ComplexNumber secondOperand){

        /**
         * Проверка деления на ноль.
         */
        if (secondOperand.getImaginaryPart() == 0 && secondOperand.getRealPart() == 0)
        {
            System.out.println("You can't divide by zero!");
            return new ComplexNumber(0, 0);
        }

        float realPartNumerator = firstOperand.getRealPart() *  secondOperand.getRealPart() + firstOperand.getImaginaryPart() * secondOperand.getImaginaryPart();
        float imaginaryPartNumerator = firstOperand.getImaginaryPart() *  secondOperand.getRealPart() - firstOperand.getRealPart() * secondOperand.getImaginaryPart();

        float denominator = secondOperand.getRealPart() * secondOperand.getRealPart()  + secondOperand.getImaginaryPart() * secondOperand.getImaginaryPart();

        float realPartResult = realPartNumerator / denominator;
        float imaginaryPartResult = imaginaryPartNumerator / denominator;

        ComplexNumber result = new ComplexNumber(realPartResult, imaginaryPartResult);
        return result;
    }


}


