package designMode.structure.adapter;

public class Client {
    public static void main(String[] args) {
        Payment alipayPayment = new PaymentAdapter(new Alipay());
        alipayPayment.pay(100.0);
    }
}
 