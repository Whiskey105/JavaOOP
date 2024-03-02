package Controllers;

import java.util.List;

import Domain.Person;
import Domain.Teacher;
import Domain.WorkingPerson;

public class AccountController {

    public static <T extends WorkingPerson> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }


    public static <T extends Person> double averageAge(List<T> persons)
    {
        if (persons.isEmpty())
        {
            System.out.println("Список для рассчета среднего возраста пуст!");
            return 0.0;
        }
        else {
            double sumAge = 0;
            for (T pers: persons)
            {
                sumAge += pers.getAge();
            }
            return sumAge/persons.size();
        }
    }
}
