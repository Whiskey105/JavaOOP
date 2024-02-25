import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        // первая группа
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for(Student std : group4580)
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for(Student std: group4580.getGroup())
        {
            System.out.println(std);
        }

        Student s7 = new Student("Петр", 25);
        Student s8 = new Student("Александр", 23);
        Student s9 = new Student("Валентин", 22);
        Student s10 = new Student("Евгения",  23);
        Student s11 = new Student("Семен",  23);
        Student s12 = new Student("Елена",  23);
        Student s13 = new Student("Алиса",  23);
        Student s14 = new Student("Оксана",  23);
        
        

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        listStud2.add(s12);
        listStud2.add(s13);
        listStud2.add(s14);
        


        StudentGroup group4582 = new StudentGroup(listStud2, 4582);
        System.out.println(group4582);

        List<StudentGroup> studentGroups01 = new ArrayList<>();
        studentGroups01.add(group4582);
        studentGroups01.add(group4580);
        StudentSteam stream01 = new StudentSteam(studentGroups01, 0001);


        System.out.println("group4582.compareTo(group4580.getGroup()) = " + group4582.compareTo(group4580));

        Collections.sort(stream01.getStream());
        for(StudentGroup stg: stream01)
        {

            System.out.println("stg = " + stg);

        }


    }
}
