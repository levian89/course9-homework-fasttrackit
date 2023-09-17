package org.fasttrackit.course9.homework.inheritance;

import org.fasttrackit.course9.homework.orderinfo.OrderInfo;

import java.util.Arrays;

public class OnlineOrderAbstract extends OrderAbstractClass {

    private final OrderInfo orderInfo;
    private final int orderNumber;
    private final String address;
    private final String customerName;

    public OnlineOrderAbstract(OrderInfo orderInfo, int orderNumber, String address, String customerName) {
        this.orderInfo = orderInfo;
        this.orderNumber = orderNumber;
        this.address = address;
        this.customerName = customerName;
    }

    @Override
    public String orderedBy() {
        return customerName;
    }

    @Override
    public String getOrderInfo() {
        return String.format("Online order, contents: %s, total price: %.2f, order number: %d, address: %s",
                Arrays.toString(orderInfo.items()), orderInfo.totalPrice(), orderNumber, address);
    }
}
