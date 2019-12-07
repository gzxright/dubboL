namespace java demo.service.api.order

include "Order.thrift"

service OrderService{

    string ping();

    Order.Order getOrder(1:i32 orderId);

}