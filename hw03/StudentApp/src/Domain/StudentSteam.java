package Domain;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StudentSteam implements Iterable<StudentGroup>{

    private List<StudentGroup> stream;
    private Integer idSteam;

    public StudentSteam(List<StudentGroup> stream, Integer idSteam) {
        this.stream = stream;
        this.idSteam = idSteam;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    public Integer getIdSteam() {
        return idSteam;
    }

    public void setIdSteam(Integer idSteam) {
        this.idSteam = idSteam;
    }

    @Override
    public String toString() {
        return "StudentSteam{" +
                "stream=" + stream +
                ", idSteam=" + idSteam +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(stream);
    }
}
