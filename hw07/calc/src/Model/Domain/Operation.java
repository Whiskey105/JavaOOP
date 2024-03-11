package Model.Domain;

import java.util.Date;

public class Operation {
    /**
     * Класс для работы с операциями.
     * Поля метода отвечают за:
     *  операнды (firstOperand, secondOperand)
     *  результат (result)
     *  номер операции (operationId)
     *  символ операции (operationSymb).
     */
    //private Float firstOperand;
    //private Float secondOperand;
    //private Float result;

    private ComplexNumber firstOperand;
    private ComplexNumber secondOperand;
    private ComplexNumber result;

    private static int count = 0;
    private int operationId;

    private String operationSymb;


    /*public Operation(Float firstOperand, Float secondOperand, Float result, String operationSymb) {
        count++;
        this.operationId = count;
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.result = result;
        this.operationSymb = operationSymb;
    }*/

    public Operation(ComplexNumber firstOperand, ComplexNumber secondOperand, ComplexNumber result, String operationSymb) {
        count++;
        this.operationId = count;
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.result = result;
        this.operationSymb = operationSymb;
    }

    @Override
    public String toString() {
        return "Operation" +" " + operationId + ")" +
                " " + firstOperand +
                " " + operationSymb +
                " " + secondOperand +
                " = " + result + ";";
    }
}
