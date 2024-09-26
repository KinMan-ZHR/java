package designMode.structure.proxy.dynmaticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 日志代理类
public class LoggingProxy implements InvocationHandler {
    private Object target;
 
    public LoggingProxy(Object target) {
        this.target = target;
    }
 
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用方法：" + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("方法调用完成");
        return result;
    }
}
