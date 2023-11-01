public class Circle extends Shape{
    private final int centerX;
    private final int centerY;
    private final int radius;

    Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public int getX(){ return centerX;}
    public int getY() {return centerY;}
    public int getRadius() {return radius;}

    @Override
    public float getArea() {
        return (float)Math.PI*radius*radius;
    }
    @Override
    public String toString(){
        return String.format("Circle %d %d ", centerX, centerY) + getArea();
    }
}
