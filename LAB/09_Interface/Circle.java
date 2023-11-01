public class Circle implements MyComparable{
    private final Point center ;
    private final int radius ;

    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }


    @Override
    public long getSize(){
        return (long)(Math.PI*radius*radius);
    }

    @Override
    public int compareTo(final MyComparable other){
        int returnValue = 0;

        if(getSize() < other.getSize()) returnValue =  -1;
        if(getSize() > other.getSize()) returnValue =  1;

        return returnValue;
    }

    @Override
    public String toString(){
        return String.format("[%s %d %d]", center, radius, getSize());
    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Circle)) return false;
        var otherCircle = (Circle) other;
        return center.equals(otherCircle.center) && radius == otherCircle.radius;
    }
}
