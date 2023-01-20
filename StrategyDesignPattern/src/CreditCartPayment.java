public class CreditCartPayment implements IPayment{

    public String name;
    public String cardNumber;
    public String cvv;
    public String dateOfExpiry;

    public CreditCartPayment(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid by credit cart");
    }
}
