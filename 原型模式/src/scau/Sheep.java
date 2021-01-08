package scau;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

public class Sheep implements Cloneable, Serializable {
    public String name;
    public int age;
    public deepSheep friend;
    public Sheep(){
        super();
    }
    public Sheep(String name,int age,deepSheep friend){
        this.name = name;
        this.age = age;
        this.friend = friend;
    }

    @Override
    public String toString(){
        return "name=" + this.name + " " + "age=" + this.age;
    }
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }

//    @Override
//    public Object clone(){
//        Sheep sheep = null;
//        try{
//            sheep = (Sheep)super.clone();
//            sheep.friend = (deepSheep) friend.clone();
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        return sheep;
//    }
    public Object deepClone() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois =new ObjectInputStream(bis);
        Sheep copyObj = (Sheep)ois.readObject();
        bos.close();
        oos.close();
        bis.close();
        ois.close();
        return copyObj;
    }
}
