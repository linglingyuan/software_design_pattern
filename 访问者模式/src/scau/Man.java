package scau;

public class Man extends Person{
    @Override
    public void accept(AbstractAction action) {
        action.getManRrsult(this);
    }
}
