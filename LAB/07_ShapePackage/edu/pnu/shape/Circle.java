package edu.pnu.shape;

public class Circle {
    private Point center ;
    private int radius ;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public String toString() {
        double area = radius * radius * 3.14;
        String msg = String.format("[ Circle %s %d %.6f]", center, radius, area);
        return msg;
    }

    public boolean equals(Object otherCircle) {
        if(!(otherCircle instanceof Circle)) return false;
        var other = (Circle)otherCircle;
        return center.equals(other.center) && radius == other.radius;
    }
}
