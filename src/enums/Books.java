package enums;

public enum Books {
    HARRY_POTTER(200),
    AK_KEME(100),
    RICH_DAD(150),
    HISTORY(80),
    SOLUTIONS(250);
    private int price;

    Books(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
