public class Item {
    private String upCode;
    public int price;

    public Item(String upCode, int price) {
        this.upCode = upCode;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
