package cn.deu.scau.sec.lingjielin.consistentcomposite;



public class AtomTestCase extends TestCase {
    public String name;
    public int a;
    public int b;
    public int expectedValue;
    public AtomTestCase(String name, int a, int b, int expectedValue) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.expectedValue = expectedValue;
    }

    @Override
    public void remove(TestCase f)throws Exception{
        throw new Exception();
    }

    @Override
    public void addEle(TestCase f) throws Exception {
        throw new Exception();
    }

    @Override
    public boolean judgeResult(){
        FourMixedOperation op = new FourMixedOperation();
        if (op.add(a,b)==expectedValue){
            System.out.print(a + " " + b + " " + expectedValue + " ");
            System.out.print(this.name);
            System.out.println("  测试通过！");
            return true;
        }else {
            System.out.print(a + " " + b + " " + expectedValue + " ");
            System.out.print(this.name);
            System.out.println("  测试没有通过!");
            return false;
        }
    }
}
