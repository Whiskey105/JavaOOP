package Services;

import Domain.Employee;
import Domain.PersonComparator;
import Domain.Teacher;

import java.util.List;

public class TeacherService implements iPersonService<Teacher>{

    private int count;

    private List<Teacher> teachers;
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, "Docent");
        count++;
        teachers.add(teacher);
    }

    public void sortByName()
    {
        PersonComparator<Teacher> personComparator = new PersonComparator<>();
        teachers.sort(personComparator);
    }
}
