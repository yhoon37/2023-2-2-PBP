package edu.pnu.shape;

public class Rectangle {
    private int width, height ;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        double area = width * height;
        String msg = String.format("[ Rectangle %d %d %.6f]", width, height, area);
        return msg;
    }

    public boolean equals(Object otherRectangle) {
        if(!(otherRectangle instanceof Rectangle)) return false;
        var other = (Rectangle)otherRectangle;
        return width == other.width && height == other.height;
    }
}
