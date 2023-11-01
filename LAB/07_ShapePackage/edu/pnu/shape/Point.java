package edu.pnu.shape;

public class Point {
    private int x, y ;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("[%d, %d]", x, y);
    }

    public boolean equals(Object otherPoint) {
        if(!(otherPoint instanceof Point)) return false;
        var other = (Point)otherPoint;
        return x == other.x && y == other.y;
    }
}
