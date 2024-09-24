package access.ex;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if(itemCount >= 10) {
            System.out.println("Shopping cart is full");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("Your shopping list");

        for(int i=0; i<itemCount; i++) {
            System.out.println("item name = " + items[i].getName() +
                    "item total price = " + (items[i].getTotalPrice()));
        }

        System.out.println("list total price = "+ calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int total = 0;
        for(int i=0; i<itemCount; i++) {
            total += items[i].getTotalPrice();
        }
        return total;
    }
}
