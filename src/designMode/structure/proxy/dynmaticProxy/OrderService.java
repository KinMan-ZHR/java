package designMode.structure.proxy.dynmaticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
 
// 定义一个订单服务接口
public interface OrderService {
    void createOrder();
    void updateOrder();
}

