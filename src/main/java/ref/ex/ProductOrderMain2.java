package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder [] orders = new ProductOrder[3];
        orders[0] = createOrder("tofu", 2000, 2);
        orders[1] = createOrder("kimchi", 5000, 1);
        orders[2] = createOrder("coke", 1500, 2);

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
