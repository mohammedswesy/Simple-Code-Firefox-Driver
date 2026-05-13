package project1;



public class TestOrders {
    public static void main(String[] args) {
    
    	Fruit Fruit1 = new Fruit("mocha", 3.5);
        Fruit Fruit2 = new Fruit("latte", 4.0);
        Fruit Fruit3 = new Fruit("drip coffee", 2.0);
        Fruit Fruit4 = new Fruit("capuccino", 5.0);

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Cindhuri");

        
        order1.addFruit(Fruit1);
        order1.addFruit(Fruit2);

        order3.addFruit(Fruit4);
        order3.addFruit(Fruit3);

        order5.addFruit(Fruit3);
        order5.addFruit(Fruit4);

        order5.setReady(true);
        System.out.println(order5.getStatusMessage());

        System.out.println("Order 1 Total: $" + order1.getOrderTotal());
        
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}