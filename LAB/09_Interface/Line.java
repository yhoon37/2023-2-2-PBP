public class Line implements MyComparable {
    private final Point point1, point2 ;

    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public long getSize(){
        return (long)Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
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
        return String.format("[%s %s %d]", point1, point2, getSize());
    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Line)) return false;
        var otherLine = (Line) other;
        return point1.equals(otherLine.point1) && point2.equals(otherLine.point2);
    }
}
