package scau.drink;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDescribetion("牛奶");
        setPrice(2.0f);
    }
}
