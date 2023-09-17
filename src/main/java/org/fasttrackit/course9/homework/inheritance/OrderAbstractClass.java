package org.fasttrackit.course9.homework.inheritance;

public abstract class OrderAbstractClass {

    public abstract String orderedBy();
    public abstract String getOrderInfo();
    public void processOrder() {
        System.out.printf("This order was placed by: %s." +
                "\nIt consists of: %s.", orderedBy(), getOrderInfo());
    }
}


// Stiu ca ar trebui sa gandesc altfel design-ul aplicatiei(claselor din pachetul inheritance) ca sa nu fie codul
// duplicat fata de cel din pachetul composition sau invers

// Pana la urma am modificat un pic pachetul composition (clasa Restaurant si am creat clasa OrderGenerator)