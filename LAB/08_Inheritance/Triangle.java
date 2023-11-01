public class Triangle extends Shape{
    private final int width;
    private final int height;

    public Triangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {return width;}
    public int getHeight() {return height;}

    @Override
    public float getArea() {
        return width*height*(float)0.5;
    }
    @Override
    public String toString(){
        return String.format("Triangle %d %d ", width, height)+ getArea();
    }
}
