public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new Item("885544",80));
        shoppingCart.add(new Item("113322",20));

        shoppingCart.setPaymentMethod(new PaypalPayment("safa@gmail.com","example password"));
        shoppingCart.pay();

        shoppingCart.setPaymentMethod(new CreditCartPayment("Julia","55885","199","10/2024"));
        shoppingCart.pay();
    }
}