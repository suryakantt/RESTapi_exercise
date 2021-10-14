package orderfiles;
public class Order {
    String name;
    int orderId, quantity;

    public Order(String name, int orderId, int quantity) {
        this.name = name;
        this.orderId = orderId;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + "\n "+
                " orderId=" + orderId +"\n"
        " quantity=" + quantity +
    }';
}
}
