package org.fasttrackit.course9.homework.composition;

public interface OrderInterface {

    String orderedBy();
    String getOrderInfo();
    default void processOrder() {
        System.out.printf("This order was placed by: %s." +
                "\nIt consists of: %s.", orderedBy(), getOrderInfo());
    }
}
