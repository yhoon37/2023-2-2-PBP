import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeManager {
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void totalArea() {
        float area=0;
        for(Shape shape : shapes) {
            area += shape.getArea();
        }
        System.out.println(area);
    }
    public void printAll() {
        if(shapes.isEmpty()){
            System.out.println("NONE");
        }
        else{
            for(Shape shape: shapes) {
                System.out.println(shape);
            }
        }
    }

    public void print(String type) {
        List<Shape> result = new ArrayList<>();

        switch (type) {
            case "R": {
                for(Shape shape: shapes){
                    if(shape instanceof Rectangle){
                        result.add(shape);
                    }
                }
                break;
            }
            case "T": {
                for(Shape shape: shapes){
                    if(shape instanceof Triangle){
                        result.add(shape);
                    }
                }
                break;
            }
            case "C": {
                for(Shape shape: shapes){
                    if(shape instanceof Circle){
                        result.add(shape);
                    }
                }
                break;
            }
            default: break;
        }

        if(result.isEmpty()){
            System.out.println("NONE");
        }
        else{
            for(Shape shape: result){
                System.out.println(shape);
            }
        }
    }

    public void removeAll() {
        System.out.println(shapes.size());
        shapes.clear();
    }
}
