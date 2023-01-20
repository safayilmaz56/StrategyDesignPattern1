import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private IPayment payment;

    public ShoppingCart(){
        items = new ArrayList<>();
    }
    public void setPaymentMethod(IPayment payment){
        this.payment = payment;
    }
    public void add(Item item){
        items.add(item);
    }
    public int calculateTotal(){
        int sum = 0;
        for (Item i : items){
            sum += i.getPrice();
        }
        return sum;
    }

    public void pay(){
        int amount = calculateTotal();
        payment.pay(amount);
    }
}
