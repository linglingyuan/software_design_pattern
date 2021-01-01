package scau;

public class  SuccessAction extends AbstractAction{
    @Override
    public void getManRrsult(Man man) {
        System.out.println("男人打的评分是成功");
    }

    @Override
    public void getWomanRrsult(Woman woman) {
        System.out.println("女人打的是成功");
    }
}
