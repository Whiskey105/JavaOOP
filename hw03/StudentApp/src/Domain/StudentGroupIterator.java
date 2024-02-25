package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> studentGroups;


    public StudentGroupIterator(List<StudentGroup> studentGroups) {
        this.counter = 0;
        this.studentGroups = studentGroups;
    }

    @Override
    public boolean hasNext() {
        return counter<studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext())
        {
            return null;
        }

        return studentGroups.get(counter++);
    }
}
