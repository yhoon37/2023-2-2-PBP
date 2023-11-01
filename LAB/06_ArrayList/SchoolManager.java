import java.util.List;
import java.util.ArrayList;

public class SchoolManager {
    private List<School> schools = new ArrayList<>();

    public School findSchool(final String schoolName){
        for(School school : schools) {
            if(school.getName().equals(schoolName))
                return school;
        }
        return null;
    }

    public School createSchool(final String schoolName) {
        final School newSchool = new School(schoolName);//error?
        schools.add(newSchool);
        return newSchool;
    }

    public List<Student> findStudent(final String studentName, final int schoolYear){
        final List<Student> foundStudents = new ArrayList<>();
        for(School school : schools) {
            for(Student student: school.getStudents()) {
                if(student.getName().equals(studentName) && student.getYear() == schoolYear) {
                    foundStudents.add(student);
                }
            }
        }
        return foundStudents;
    }

    public void removeAllSchools() {
        for(School school: schools) {
            school.getStudents().clear();
        }
        schools.clear();
    }

    public String toString() {
        String msg = "Total School Count: " + schools.size();
        for(School school : schools) {
            msg =  msg + "\n" + school;
        }
        return msg;
    }
}
