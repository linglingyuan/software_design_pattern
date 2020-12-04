package cn.deu.scau.sec.lingjielin.consistentcomposite;

import cn.edu.scau.sec.lingjielin.safecomposite.AtomTestCase;
import cn.edu.scau.sec.lingjielin.safecomposite.TestSuite;

public class Client {
    public static void main(String[] args) throws Exception{
        TestSuite root = new TestSuite("第一个组合");
        System.out.println("-----------------------1---------------------------");
        AtomTestCase atomTestCase =new AtomTestCase("第一个原子测试用例",1,1,2);
        atomTestCase.judgeResult();
        System.out.println("-----------------------2---------------------------");
        AtomTestCase atomTestCase1 =new AtomTestCase("第二个原子测试用例",2,1,3);
        atomTestCase1.judgeResult();
        System.out.println("-----------------------3-- -------------------------");
        AtomTestCase atomTestCase2 =new AtomTestCase("第三个原子测试用例",2,1,4);
        atomTestCase2.judgeResult();
        System.out.println("-----------------------4---------------------------");
        root.addEle(atomTestCase);
        root.judgeResult();
        System.out.println( root.name + "测试添加了第一个原子测试用例后测试完成");
        System.out.println("-----------------------5---------------------------");
        root.addEle(atomTestCase1);
        root.judgeResult();
        System.out.println( root.name + "测试添加了第一个和第二个原子测试用例后测试完成");
        System.out.println("-----------------------6---------------------------");
        TestSuite testSuite = new TestSuite("第二个组合");
        testSuite.addEle(atomTestCase2);
        testSuite.judgeResult();
        System.out.println("第二个组合测试用例测试完成");
        System.out.println("-----------------------7---------------------------");
        root.addEle(testSuite);
        root.judgeResult();
        System.out.println("第一个组合测试用例添加了第二个组合测试用例后，第一个组合测试用例运行完毕");
        System.out.println("-----------------------8---------------------------");
        root.remove(testSuite);
        root.judgeResult();
        System.out.println("第一个组合测试用例删除了第二个组合测试用例后，第一个组合测试用例运行完毕");
        //System.out.println("----------------------------------------------------");
    }
}
