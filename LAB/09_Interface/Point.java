public class Point {
    private final int x, y ;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){return x;}
    public int getY(){return y;}

    @Override
    public String toString(){
        return String.format("[%d, %d]", x, y);
    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Point)) return false;
        var otherPoint = (Point) other;
        return x == otherPoint.x && y == otherPoint.y;
    }
}
