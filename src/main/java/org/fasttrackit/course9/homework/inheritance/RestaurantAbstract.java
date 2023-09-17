package org.fasttrackit.course9.homework.inheritance;


public class RestaurantAbstract {
    private final String name;
    private final OrderAbstractClass[] orders;

    public RestaurantAbstract(String name, OrderAbstractClass[] orders) {
        this.name = name;
        this.orders = orders;
    }

    public void handleOrders() {
        for (OrderAbstractClass order : orders) {
            order.processOrder();
            System.out.printf("\nRestaurant's name: %s.", getName());
            System.out.println("\n*****");
        }
    }

    public String getName() {
        return name;
    }
}
