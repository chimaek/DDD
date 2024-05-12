package net.chimaek.ddd;

public enum OrderState {
  PAYMENT_WAITING {
    @Override
    public boolean isShippingChangeable() {
      return true;
    }
  },
  PREPARING {
    @Override
    public boolean isShippingChangeable() {
      return true;
    }
  },
  SHIPPED {
    @Override
    public boolean isShippingChangeable() {
      return false;
    }
  },
  DELIVERING {
    @Override
    public boolean isShippingChangeable() {
      return false;
    }
  },
  DELIVERY_COMPLETED {
    @Override
    public boolean isShippingChangeable() {
      return false;
    }
  };

  public abstract boolean isShippingChangeable();
}