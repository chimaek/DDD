package net.chimaek.ddd;

public class Order {
    private OrderState state;
    private ShippingInfo shippingInfo;

    public void changeShippingInfo(ShippingInfo newShippingInfo) {
        if(!state.isShippingChangeable()) {
            throw new IllegalArgumentException("can't change shipping in " + state);
        }
        this.shippingInfo = newShippingInfo;
    }

}