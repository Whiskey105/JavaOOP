package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModelClassHash implements iGetModel {

    private HashMap<Integer, Student> studentHashMap;

    public ModelClassHash(List<Student> students) {

        this.studentHashMap = new HashMap<>();
        for (Student std: students) {
            this.studentHashMap.put(std.getId(), std);
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentHashMap.values());
    }

    @Override
    public boolean deleteStudent(Integer idStudent) {
        if (!isStudentExist(idStudent)) {
            return false;
        }
        studentHashMap.remove(idStudent);
        return true;
    }

    @Override
    public boolean isStudentExist(Integer idStudent) {
        return studentHashMap.containsKey(idStudent);
    }



}
