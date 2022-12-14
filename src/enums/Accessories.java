package enums;

public enum Accessories {
    HEADPHONE(70),
    PHONE(500),
    LAPTOP(700),
    SMART_WATCH(200),
    GLASSES(100),
    ALARM(70);

    private int price;
    Accessories(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
