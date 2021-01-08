package scau;

public class Client {
    public static void main(String[] args) throws Exception{

        deepSheep test = new deepSheep("jack");
        Sheep sheep = new Sheep("jay",29,test);
        Sheep sheep1 = (Sheep)sheep.deepClone();
        System.out.println(sheep.toString() + " " + sheep.friend.hashCode() + sheep.friend.name);
        System.out.println(sheep1.toString() + " " +sheep1.friend.hashCode()+ sheep1.friend.name);
        sheep1.friend.name = "hhh";
        System.out.println(sheep.toString() + " " + sheep.friend.hashCode() + sheep.friend.name);
        System.out.println(sheep1.toString() + " " +sheep1.friend.hashCode()+ sheep1.friend.name);
    }
}
