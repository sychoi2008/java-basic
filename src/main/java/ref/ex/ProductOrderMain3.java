package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many orders do you need? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder [] orders = new ProductOrder[n];
        for(int i=0; i<n; i++) {
            System.out.println("no. "+(i+1)+" order is ...");
            System.out.println("product name : ");
            String productName = scanner.nextLine();

            System.out.println("price : ");
            int price = scanner.nextInt();

            System.out.println("quantity : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        System.out.println("total price : " + getTotalAmount(orders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("productName : "+order.productName+", price : "+order.price+", quantity : "+order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
