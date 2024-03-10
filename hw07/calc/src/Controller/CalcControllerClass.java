package Controller;

import Controller.Interfaces.iGetView;
import Model.Domain.Operation;

import java.util.Scanner;


public class CalcControllerClass{
    /**
     *Класс для проведения математичсеких операций
     * sum - метод для рассчета суммы
     * subtraction - метод для рассчета разницы
     * multiplication - метод для рассчета произведения
     * division - метод для рассчета деления, метод проверяет
     * @param secondOperand, на равенсво нулю, если значение равно, то метод возврашает Float.valueOf(0)
     *
     */
    public static Float sum(Float firsOperand, Float secondOperand){
        return firsOperand + secondOperand;
    }

    public static Float subtraction(Float firsOperand, Float secondOperand){
        return firsOperand - secondOperand;
    }

    public static Float multiplication(Float firsOperand, Float secondOperand){
        return firsOperand * secondOperand;
    }

    public static Float division(Float firsOperand, Float secondOperand){
        if (secondOperand == 0)
        {
            System.out.println("You can't divide by zero!");
            return Float.valueOf(0);
        }
        return firsOperand / secondOperand;
    }


}


