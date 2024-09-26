package designMode.structure.adapter;

public class PaymentAdapter implements Payment {
    private Alipay alipay;
 
    public PaymentAdapter(Alipay alipay) {
        this.alipay = alipay;
    }
 
    @Override
    public void pay(double amount) {
        alipay.doPayment(amount);
    }
}
 