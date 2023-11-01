public class School {
    private String name ;
    private int limit ;

    private Student[] students ;
    private int studentCount ;

    public String toString() {
        String msg = "School Name: " + name + " Student Count: "
                + studentCount + "\n" ;

        for ( int i = 0 ; i < studentCount ; i ++ ) {
            msg += "\t" + students[i] + "\n" ;
        }
        return msg ;
    }

    // other methods including constructor, equals(), hashCode()
    public School(final String name, final int limit){
        this.name = name;
        this.limit = limit;
        students = new Student[limit];
        studentCount=0;
    }

    public void addStudent(final Student newStudent) {
        if(studentCount < limit){
            students[studentCount] = newStudent;
            studentCount++;
        }
    }

    public void removeAllStudent() {
        for(int i=0; i<studentCount; i++) {
            students[i] = null;
        }
        studentCount = 0;
    }

    public Student findStudent(final String studentName, final int schoolYear) {
        Student newStudent = new Student(studentName, schoolYear);
        for(int i=0; i<studentCount; i++){
            if(students[i].equals(newStudent)){
                return students[i];
            }
        }
        return null;
    }

    public boolean equals(Object otherSchool) {
        if(!(otherSchool instanceof School)) return false;
        var other = (School)otherSchool;
        if(!name.equals(other.name) || (limit != other.limit) || (studentCount != other.studentCount)) {
            return false;
        }
        for(int i=0; i < studentCount; i++) {
            if(!students[i].equals(other.students[i])) return false;
        }
        return true;
    }

    public int hashCode(){
        int hash = 0;
        hash = 31 * hash + limit;
        hash = 31 * hash + studentCount;
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        return hash;
    }
}
