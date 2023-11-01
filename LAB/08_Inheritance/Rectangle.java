public class Rectangle extends Shape{
    private final int width;
    private final int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {return width;}
    public int getHeight() {return height;}

    @Override
    public float getArea() {
        return (float)width*height;
    }
    @Override
    public String toString(){
        return String.format("Rectangle %d %d ", width, height) + getArea();
    }
}
