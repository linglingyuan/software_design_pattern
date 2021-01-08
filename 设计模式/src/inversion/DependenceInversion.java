package inversion;

public class DependenceInversion {
    public static void main(String[] args) {
        new Person().recieve(new Email());
    }
}
interface Reciever{
    public String getInfo();
}
class Person{
    public void recieve(Reciever reciever){
        System.out.println(reciever.getInfo());
    }
}
class Email implements Reciever{
    public String getInfo(){
        return "电子邮件";
    }
}