package scau.drink;

public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return this.getPrice() + drink.cost();
    }
    @Override
    public String getDescribetion() {
        return this.describetion + " " + this.getPrice() + "&&" + drink.getDescribetion();
    }
}
