public class Student {
    private final String name ;
    private int year ;
    private final School theSchool ;

    public Student(final School theSchool, final String name, final int year){
        this.theSchool = theSchool;
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }

    public String toString() {
        final String msg = "[Name: " + name + ", School:" + theSchool.getName() + ", " + year + "학년]";
        return msg;
    }

    public boolean equals(Object otherStudent) {
        if(!(otherStudent instanceof Student)) return false;
        var other = (Student)otherStudent;
        return name.equals(other.name) && (year == other.year);
    }

    public int hashCode() {
        int hash = 0;
        hash = 31 * hash + year;
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        return hash;
    }
}
