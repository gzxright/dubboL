package demo.service.order;


import demo.service.api.order.Order;
import demo.service.api.order.OrderService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

/**
 * Created by yangjunming on 3/5/16.
 * author: yangjunming@huijiame.com
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService.Iface {


    @Override
    public String ping() throws TException {
        return "pong";
    }

    @Override
    public Order getOrder(int orderId) throws TException {
        return new Order(orderId).setOrderTitle("aaaa");
    }
}
