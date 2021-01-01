package scau;

public class FailedAction extends AbstractAction{
    @Override
    public void getManRrsult(Man man) {
        System.out.println("男人给的是失败");
    }

    @Override
    public void getWomanRrsult(Woman woman) {
        System.out.println("女人给的是失败");
    }
}
