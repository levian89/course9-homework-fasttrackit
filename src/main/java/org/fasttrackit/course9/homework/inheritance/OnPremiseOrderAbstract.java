package org.fasttrackit.course9.homework.inheritance;

import org.fasttrackit.course9.homework.orderinfo.OrderInfo;

import java.util.Arrays;

public class OnPremiseOrderAbstract extends OrderAbstractClass {
    private final OrderInfo orderInfo;
    private final int tableNumber;
    private final int noOfCustomers;

    public OnPremiseOrderAbstract(OrderInfo orderInfo, int tableNumber, int noOfCustomers) {
        this.orderInfo = orderInfo;
        this.tableNumber = tableNumber;
        this.noOfCustomers = noOfCustomers;
    }

    @Override
    public String orderedBy() {
        return "Table's number: " + tableNumber;
    }

    @Override
    public String getOrderInfo() {
        return String.format("On premise order, contents: %s, total price: %.2f, table's number: %d, number of customers: %s",
                Arrays.toString(orderInfo.items()), orderInfo.totalPrice(), tableNumber, noOfCustomers);
    }
}
