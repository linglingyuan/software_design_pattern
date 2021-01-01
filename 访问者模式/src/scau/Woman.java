package scau;

public class Woman extends Person{
    @Override
    public void accept(AbstractAction action) {
        action.getWomanRrsult(this);
    }
}
