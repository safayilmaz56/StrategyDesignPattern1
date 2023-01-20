public class PaypalPayment implements IPayment{

    public String email;
    public String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid by Paypal");
    }
}
