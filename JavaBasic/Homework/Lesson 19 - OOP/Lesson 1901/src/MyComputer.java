public class MyComputer {
    String producer;
    String model;
    String color;
    String material;
    Date releaseDate;
    PCData details;
    double price;
    boolean sold;
    public MyComputer (String prod, String mod, String col, String material, Date release, PCData details, double price, boolean isSold){
        this.producer = prod;
        this.model = mod;
        this.color = col;
        this.material = material;
        this.releaseDate = release;
        this.details = details;
        this.price = price;
        this.sold = isSold;
    }
    public String toString(){
        return "Producer name: " + producer + "\n Model: " + model + "\n Color: " + color + "\n Coating material: " + material + "\n Date of release: " + releaseDate + "\n More details " + details.toString() + "\n Availability: " + (sold ? "Sold out" : "Available") + "\n Price: " + "\n " + price;
    }
}
