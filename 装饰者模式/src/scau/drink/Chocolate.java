package scau.drink;

public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDescribetion("巧克力");
        setPrice(3.0f);
    }
}
