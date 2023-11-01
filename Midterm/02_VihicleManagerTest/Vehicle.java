public abstract class Vehicle {
    private final String maker;
    private final int price;

    public Vehicle(String maker, int price){
        this.maker = maker;
        this.price = price;
    }
    public int getPrice(){return price;}
    public String getMaker(){return maker;}


}
