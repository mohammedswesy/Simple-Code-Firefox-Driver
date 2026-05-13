package project1;



public class TestOrders {
    public static void main(String[] args) {
    
    	Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.0);
        Item item3 = new Item("drip coffee", 2.0);
        Item item4 = new Item("capuccino", 5.0);

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Cindhuri");

        
        order1.addItem(item1);
        order1.addItem(item2);

        order3.addItem(item4);
        order3.addItem(item3);

        order5.addItem(item3);
        order5.addItem(item4);

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