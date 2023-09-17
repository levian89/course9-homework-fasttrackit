package org.fasttrackit.course9.homework.composition;

public class OrderGenerator {
    private final Restaurant restaurant;
    private final OrderInterface[] orders;

    public OrderGenerator(Restaurant restaurant, OrderInterface[] orders) {
        this.restaurant = restaurant;
        this.orders = orders;
    }

    public void handleOrders() {
        for (OrderInterface order : orders) {
            order.processOrder();
            System.out.printf("\nRestaurant's name: %s.", restaurant.getName());
            System.out.println("\n*****");
        }
    }

}
