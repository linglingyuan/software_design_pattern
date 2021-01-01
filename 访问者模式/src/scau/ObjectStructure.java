package scau;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
    private List<Person> personList = new LinkedList<>();
    public void attach(Person p){
        personList.add(p);
    }
    public void remove(Person p){
        personList.remove(p);
    }
    public void display(AbstractAction action){
        for (Person person : personList){
            person.accept(action);
        }
    }
}
