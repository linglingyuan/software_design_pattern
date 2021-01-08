package scau.drink;

public abstract class Drink {
    public String describetion;
    private float price = 0.0f;

    public String getDescribetion() {
        return describetion;
    }

    public void setDescribetion(String describetion) {
        this.describetion = describetion;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public abstract float cost();
}
