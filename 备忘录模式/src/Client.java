public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("123");
        careTaker.addList(originator.saveMemento());
        originator.setState("5667");
        careTaker.addList(originator.saveMemento());
        System.out.println("当前状态：" + originator.getState());
        System.out.println(careTaker.getMemento(0).getState());
    }
}
