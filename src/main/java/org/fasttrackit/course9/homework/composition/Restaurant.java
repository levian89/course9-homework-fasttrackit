package org.fasttrackit.course9.homework.composition;


// Am facut modificarea asta aici deoarece am vrut sa nu fie codul intru totul duplicat (composition vs inheritance)

public class Restaurant {
    private final String name;
//    private final OrderInterface[] orders;

    public Restaurant(String name) {
        this.name = name;
//        this.orders = orders;
    }

//    public void handleOrders() {
//        for (OrderInterface order : orders) {
//            order.processOrder();
//            System.out.printf("\nRestaurant's name: %s.", getName());
//            System.out.println("\n*****");
//        }
//    }

    public String getName() {
        return name;
    }
}
