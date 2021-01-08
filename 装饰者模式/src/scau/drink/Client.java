package scau.drink;

public class Client {
    public static void main(String[] args) {
        Drink drink = new KaBuQiNuo();
        drink = new Milk(drink);
        drink = new Chocolate(drink);
        System.out.println(drink.getDescribetion() + drink.cost());
    }
}
