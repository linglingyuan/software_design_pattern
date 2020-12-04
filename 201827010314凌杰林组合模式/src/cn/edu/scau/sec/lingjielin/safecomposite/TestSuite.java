package cn.edu.scau.sec.lingjielin.safecomposite;

import java.util.ArrayList;
import java.util.List;

public class TestSuite extends TestCase {
    public String name;
    private List<TestCase> components = new ArrayList<>();
    public TestSuite(String name){
        this.name = name;
    }

    //@Override
    public void addEle(TestCase f){
        components.add(f);
    }

    //@Override
    public void remove(TestCase f){
        components.remove(f);
    }

    @Override
    public boolean judgeResult() {
        for (TestCase item : components){
            if (item instanceof AtomTestCase){
                if (item.judgeResult()){
                    continue;
                }
            }else {
                item.judgeResult();
            }
        }
        return true;
    }
}
