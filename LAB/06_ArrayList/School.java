import java.util.List;
import java.util.ArrayList;

public class School {
    private final String name ;
    private List<Student> students = new ArrayList<>() ;

    public School(final String name) { this.name = name ; }


    public String getName(){
        return name;
    }
    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }


    public String toString() {
        String msg = "[School Name: " + name + " Student Count: " + students.size();
        for(Student student : students) {
            msg =  msg + "\n" + student;
        }
        msg += "\n";
        return msg;
    }

    public boolean equals(Object otherSchool){
        if(!(otherSchool instanceof School)) return false;
        var other = (School)otherSchool;
        if(!name.equals(other.getName())) return false;
        return true;
    }
}
