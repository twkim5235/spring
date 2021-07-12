package hello.core.order;

public interface OrderService {
    Order createOrder(Long membberId, String itemName, int itemPrice);

}
