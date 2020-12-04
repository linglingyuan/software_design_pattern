package cn.deu.scau.sec.lingjielin.consistentcomposite;

public abstract class TestCase {
  public abstract void remove(TestCase f) throws Exception;
  public abstract void addEle(TestCase f) throws Exception;
  public abstract boolean judgeResult();
}
