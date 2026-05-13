package project1;
import java.util.ArrayList;
public class Order {
	private String name;
    private boolean ready;
    private ArrayList<Fruit> Fruits;

    
    public Order() {
        this.name = "Guest";
        this.Fruits = new ArrayList<Fruit>();
    }

    
    public Order(String name) {
        this.name = name;
        this.Fruits = new ArrayList<Fruit>();
    }

   
    public void addFruit(Fruit Fruit) {
        this.Fruits.add(Fruit);
    }

    public String getStatusMessage() {
        if(this.ready) {
            return "Your order is ready.";
        }
        return "Thank you for waiting. Your order will be ready soon.";
    }

    public double getOrderTotal() {
        double total = 0;
        for(Fruit Fruit : Fruits) {
            total += Fruit.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for(Fruit Fruit : Fruits) {
            System.out.println(Fruit.getName() + " - $" + Fruit.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal() + "\n");
    }

   
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean isReady() { return ready; }
    public void setReady(boolean ready) { this.ready = ready; }

    public ArrayList<Fruit> getFruits() { return Fruits; }
    public void setFruits(ArrayList<Fruit> Fruits) { this.Fruits = Fruits; }
}
