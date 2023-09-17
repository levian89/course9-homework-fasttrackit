package org.fasttrackit.course9.homework;

import org.fasttrackit.course9.homework.composition.*;
import org.fasttrackit.course9.homework.inheritance.OnPremiseOrderAbstract;
import org.fasttrackit.course9.homework.inheritance.OnlineOrderAbstract;
import org.fasttrackit.course9.homework.inheritance.OrderAbstractClass;
import org.fasttrackit.course9.homework.inheritance.RestaurantAbstract;
import org.fasttrackit.course9.homework.orderinfo.OrderInfo;

// Stiu ca ar trebui sa gandesc altfel design-ul aplicatiei(claselor din pachetul inheritance) ca sa nu fie codul
// duplicat fata de cel din pachetul composition sau invers

// Ca sa nu fie duplicat codul, pana la urma am creat clasa OrderGenerator in pachetul composition
// Oricum, daca ar fi sa aleg o singura varianta de rezolvare as merge pe "composition" cu design-ul de la "inheritance",
// adica fara "OrderGenerator" :)

public class OrderMain {
    public static void main(String[] args) {
        OrderInfo onlineOrderInfo = new OrderInfo(new String[]{"Soup", "Steak"}, 80.52);
        OrderInfo onPremiseOrderInfo = new OrderInfo(new String[]{"Burger", "Pizza", "Salad",
                "Pasta", "Chinese"}, 205.95);

        OnlineOrder onlineOrder = new OnlineOrder(onlineOrderInfo,
                23, "Edgar Quinet", "Gheorghe");
        OnPremiseOrder onPremiseOrder = new OnPremiseOrder(onPremiseOrderInfo, 10, 5);

        OrderInterface[] orders = {onlineOrder};
        OrderInterface[] orders1 = {onPremiseOrder};

//        Restaurant restaurant = new Restaurant("Big Belly", orders);
//        restaurant.handleOrders();

        OrderGenerator bigBelly = new OrderGenerator(new Restaurant("Big Belly"), orders);
        bigBelly.handleOrders();

//        Restaurant restaurant1 = new Restaurant("Fat Belly", orders1);
//        restaurant1.handleOrders();

        OrderGenerator fatBelly = new OrderGenerator(new Restaurant("Fat Belly"), orders1);
        fatBelly.handleOrders();

        System.out.println("****************************");

        OrderInfo onlineOrderInfo1 = new OrderInfo(new String[]{"Fish & Chips", "Pork Steak"}, 100.52);
        OrderInfo onPremiseOrderInfo1 = new OrderInfo(new String[]{"Veggie Burger", "Pepperoni Pizza", "Caesar Salad",
                "Chinese Mushrooms & Bamboo"}, 255.95);

        OnlineOrderAbstract onlineOrderAbstract = new OnlineOrderAbstract(onlineOrderInfo1,
                15, "Sovata", "Vasile");
        OnPremiseOrderAbstract onPremiseOrderAbstract = new OnPremiseOrderAbstract
                (onPremiseOrderInfo1, 7, 4);

        OrderAbstractClass[] orders2 = {onlineOrderAbstract};
        OrderAbstractClass[] orders3 = {onPremiseOrderAbstract};

        RestaurantAbstract restaurant2 = new RestaurantAbstract("Little Belly", orders2);
        restaurant2.handleOrders();
        RestaurantAbstract restaurant3 = new RestaurantAbstract("Small Belly", orders3);
        restaurant3.handleOrders();
    }
}
