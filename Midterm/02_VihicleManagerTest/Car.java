import java.util.Objects;

public class Car extends Vehicle{
    private final String owner;

    public Car(String maker, int price, String owner){
        super(maker, price);
        this.owner = owner;
    }

    public String toString(){
        return String.format("Car [Maker=%s], [Price=%d], [Owner=%s]", getMaker(), getPrice(), owner);
    }

    public boolean equals(Object otherObject){
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(getClass() != otherObject.getClass()) return false;
        Car other = (Car)otherObject;
        return Objects.equals(getMaker(), other.getMaker()) && Objects.equals(getPrice(), other.getPrice())
                && Objects.equals(owner, other.owner);
    }
}
