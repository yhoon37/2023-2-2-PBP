import java.util.ArrayList;
import java.util.List;
public class VehicleManager {
    private final List<Vehicle> vehicles = new ArrayList<>();

    public void add(Vehicle vehicle){
        if(!vehicles.contains(vehicle)){
            vehicles.add(vehicle);
        }
    }

    public int getCount(){
        return vehicles.size();
    }

    public Vehicle get(int index){
        return vehicles.get(index);
    }

    public int getTotalPrice(){
        int totalPrice=0;
        for(Vehicle v : vehicles){
            totalPrice += v.getPrice();
        }
        return totalPrice;
    }

}
