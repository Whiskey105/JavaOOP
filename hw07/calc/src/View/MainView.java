package View;

import Model.Domain.Operation;
import Controller.Interfaces.iGetView;

import java.util.List;
import java.util.Scanner;

public class MainView implements iGetView{
    /**
     * Класс отвечающий за вывод на консоль и передачу значений из консоли
     */

    /**
     * Метод выводит в консоль список операций
     * @param operationsList - список оперций
     */
    public void printLog(List<Operation> operationsList){
        System.out.println("--------------------------Operation Log--------------------------------");
        for (Operation op: operationsList){
            System.out.println(op);
        }
        System.out.println("-----------------------------------------------------------------------");

    }

    /**
     * метод для приглашения пользователя к вводу
     * @param msg - сообщения для вывода в консоль для запроса ввода
     * @return значение, которе ввел пользователь
     */
    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }


}
