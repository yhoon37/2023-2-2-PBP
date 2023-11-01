import java.util.Objects;
public class Ship extends Vehicle{
    private final int weight;
    public Ship(String maker, int price, int weight){
        super(maker, price);
        this.weight = weight;
    }

    public String toString(){
        return String.format("Ship [Maker=%s], [Price=%d], [Weight=%d]", getMaker(), getPrice(), weight);
    }

    public boolean equals(Object otherObject){
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(getClass() != otherObject.getClass()) return false;
        Ship other = (Ship)otherObject;
        return Objects.equals(getMaker(), other.getMaker()) && Objects.equals(getPrice(), other.getPrice())
                && weight == other.weight;
    }
}
