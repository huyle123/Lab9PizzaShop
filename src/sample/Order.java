package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private int orderItem;
    private int itemQuantity;

    //Constructor Method
    public Order(int _orderId){
        this.orderId = _orderId;
    }

    //Setters and Getters

    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) { this.orderId = _orderId;}

    public int getorderItem() { return orderItem; }
    public void setorderItem(int _orderItem) { this.orderItem = _orderItem;}

    public int getitemQuantity() { return itemQuantity; }
    public void setitemQuantity(int _itemQuantity) { this.itemQuantity = _itemQuantity;}


    public void getOrderInfo(ArrayList<Order> oList, ArrayList<Menu> menuItem)
    {
        for (Menu menu: menuItem) {
            System.out.print(menu.getmenuId());
            System.out.print(" " + menu.getmenuItem());
            System.out.println(" " + menu.getmenuPrice());
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an order ID");
        setorderId(input.nextInt());

        System.out.println("Please enter the item ID you want to order");
        setorderItem(input.nextInt());

        System.out.println("Please enter the item quantity you want");
        setitemQuantity(input.nextInt());

        System.out.println(getorderItem());
        System.out.println("Your order ID is: " + getorderId());
        System.out.println("You ordered: " + getitemQuantity() + " Pizzas");

        switch (orderItem) {
            case 1:
                System.out.println("You have selected Cheese");
                break;
            case 2:
                System.out.println("You have selected Three Meats");
                break;
            case 3:
                System.out.println("You have selected Extra Cheese");
                break;
            case 4:
                System.out.println("You selected Extra Three Meats");
                break;
            case 5:
                System.out.println("You Selected Vegetarian");
                break;
        }
    }
}
