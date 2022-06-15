package solid.example.junit;

public class GoldCustomer extends Customer implements FreeDelivery, Discount {
    @Override
    public int getDiscountAmount() {
        return 25;
    }

    @Override
    public void getFreeDelivery() {
        //some code
    }
}
