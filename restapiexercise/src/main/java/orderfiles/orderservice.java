package orderfiles;

import orderfiles.order;
import java.util.ArrayList;
import java.util.List;

public class CustomOperation {
    public static List<Order> createDummyList(){
        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order("mustang1970", 1, 2));
        orderList.add(new Order("aston martin", 2, 3));
        return orderList;
    }
}
