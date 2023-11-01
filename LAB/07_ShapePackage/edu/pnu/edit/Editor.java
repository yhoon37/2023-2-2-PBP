package edu.pnu.edit;
import java.util.ArrayList;
import java.util.List;
public class Editor {
    private List<Object> shapes = new ArrayList<>();

    public void add(Object shape) {
        shapes.add(shape);
    }

    public void clear() {
        shapes.clear();
    }

    public void list() {
        System.out.print("[");
        if(!shapes.isEmpty()) System.out.print(shapes.get(0));
        for(int i=1; i<shapes.size(); i++) {

            System.out.print(", " + shapes.get(i));
        }
        System.out.println("]");
    }
}
