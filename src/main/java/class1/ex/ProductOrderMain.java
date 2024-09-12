package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder [] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "tofu";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "kimchi";
        order2.price = 5000;
        order2.quantity = 1;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "coke";
        order3.price = 1500;
        order3.quantity = 2;
        orders[2] = order3;
        
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("Product Name : "+ order.productName + ", price : " + order.productName
                    + ", quantity : " + order.quantity);
            totalAmount += order.price * order.quantity;
        }
        System.out.println("total price : "+totalAmount);

    }
}
