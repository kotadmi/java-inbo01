package ru.kotadmi.Laba1.Pr_30;

public class Main {
    public static void main(String[] args) {
        InternetOrder order = new InternetOrder();
        order.add(
                new Drink(
                        200,
                        "Latte",
                        "Coffee",
                        0,
                        DrinkTypeEnum.COFFEE
                )
        );
        order.add(
                new Dish(
                        399,
                        "Maffin",
                        "Dessert"
                )
        );

        order.setCustomer(Customer.MATURE_UNKNOWN_CUSTOMER);

        InternetOrdersManager ordersManager = new InternetOrdersManager();
        ordersManager.add(order);

        System.out.println(ordersManager.ordersCostSummary());
    }

}

