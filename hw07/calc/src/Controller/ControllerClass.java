package Controller;

import Model.Domain.ComplexNumber;
import Model.Domain.Operation;
import View.MainView;

import java.util.ArrayList;
import java.util.List;

public class ControllerClass {
    /**
     * Класс, который используется для управления приложением
     *
     */

    private MainView view;

    private List<Operation> operationsBuffer = new ArrayList<>();

    public ControllerClass(MainView view) {
        this.view = view;
    }

    public void run() {
        /**
         *  Основной метод для работы приложения
         *  цикл While работает пока значение isRunning не равно false,
         *  значение меняется только при получении с консоли команды EXIT
         *  @param firstOperandBuffer - буффер для первого операнда
         *  @param secondOperandBuffer - буффер для второго операнда
         *  @param resultBuffer - буффер для результата вичисления
         *  @param operationBuffer - буффер для объекта Класса Operation
         *
         *  После вычисления объект класса Operation, добавляется в список operationsBuffer
         */
        Command com = Command.NONE;
        boolean isRunning = true;
        printAllCommands();
        ComplexNumber firstOperandBuffer;
        ComplexNumber secondOperandBuffer;
        ComplexNumber resultBuffer;

        Operation operationBuffer;



        while (isRunning){

            String command = view.prompt("Enter the command: ");
            com = Command.valueOf(command.toUpperCase());
            /**
             * switch - для переключения между командами, которые вводит пользователь.
             * Список всех комманд и их назначение представлены в Command
             */
            switch (com){

                case DIV:

                    firstOperandBuffer = new ComplexNumber(view.prompt("Enter the firstOperand realPart: "), view.prompt("Enter the firstOperand imaginaryPart: "));
                    secondOperandBuffer = new ComplexNumber(view.prompt("Enter the secondOperand realPart: "), view.prompt("Enter the secondOperand imaginaryPart: "));
                    /**
                     * Проверка на деление на ноль
                     */
                    if (secondOperandBuffer.getRealPart() == 0 && secondOperandBuffer.getImaginaryPart() == 0)
                    {
                        System.out.println("You can't divide by zero!");
                        break;
                    }

                    resultBuffer = CalcControllerClass.division(firstOperandBuffer, secondOperandBuffer);

                    operationBuffer = new Operation(firstOperandBuffer, secondOperandBuffer, resultBuffer, "/");

                    System.out.println(operationBuffer);

                    operationsBuffer.add(operationBuffer);
                    break;

                case LOG:
                    view.printLog(operationsBuffer);
                    break;

                case MUL:

                    firstOperandBuffer = new ComplexNumber(view.prompt("Enter the firstOperand realPart: "), view.prompt("Enter the firstOperand imaginaryPart: "));
                    secondOperandBuffer = new ComplexNumber(view.prompt("Enter the secondOperand realPart: "), view.prompt("Enter the secondOperand imaginaryPart: "));

                    resultBuffer = CalcControllerClass.multiplication(firstOperandBuffer, secondOperandBuffer);

                    operationBuffer = new Operation(firstOperandBuffer, secondOperandBuffer, resultBuffer, "*");

                    System.out.println(operationBuffer);

                    operationsBuffer.add(operationBuffer);
                    break;

                case SUB:

                    firstOperandBuffer = new ComplexNumber(view.prompt("Enter the firstOperand realPart: "), view.prompt("Enter the firstOperand imaginaryPart: "));
                    secondOperandBuffer = new ComplexNumber(view.prompt("Enter the secondOperand realPart: "), view.prompt("Enter the secondOperand imaginaryPart: "));

                    resultBuffer = CalcControllerClass.subtraction(firstOperandBuffer, secondOperandBuffer);

                    operationBuffer = new Operation(firstOperandBuffer, secondOperandBuffer, resultBuffer, "-");

                    System.out.println(operationBuffer);

                    operationsBuffer.add(operationBuffer);
                    break;

                case SUM:

                    firstOperandBuffer = new ComplexNumber(view.prompt("Enter the firstOperand realPart: "), view.prompt("Enter the firstOperand imaginaryPart: "));
                    secondOperandBuffer = new ComplexNumber(view.prompt("Enter the secondOperand realPart: "), view.prompt("Enter the secondOperand imaginaryPart: "));

                    resultBuffer = CalcControllerClass.sum(firstOperandBuffer, secondOperandBuffer);

                    operationBuffer = new Operation(firstOperandBuffer, secondOperandBuffer, resultBuffer, "+");

                    System.out.println(operationBuffer);

                    operationsBuffer.add(operationBuffer);
                    break;

                case EXIT:
                    isRunning = false;
                    System.out.println("Exit the program...");
                    break;

                case HELP:
                    printAllCommands();
                    break;
            }
        }
    }

    public void printAllCommands(){
        /**
         * Метод для вывода всех команд, вызывается в методе run для первичного ввода всех команд в консоль
         */
        System.out.println("--------------Command list--------------\n" +
                "    LOG -> Operation log\n" +
                "    SUM -> Sum\n" +
                "    SUB -> Subtraction\n" +
                "    MUL -> Multiply\n" +
                "    DIV -> Division\n" +
                "    HELP -> Print command list\n" +
                "    EXIT -> Exit the program");
    }

}
