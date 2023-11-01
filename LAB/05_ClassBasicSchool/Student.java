public class Student {
    private String name ;
    private int year ;

    public Student(final String name, final int year){
        this.name = name;
        this.year = year;
    }
    // toString(), equals(), hashcode()

    public String toString() {
        String msg = "[" + name + ", " + year + "학년]";
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
