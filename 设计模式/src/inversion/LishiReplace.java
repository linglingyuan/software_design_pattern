package inversion;

public class LishiReplace {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.func1(3,5));
        //不知道B类已经重写了func1方法
        B b = new B();
        System.out.println(b.func1(3,5));
    }
}

class A{
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}
class B extends A{

    @Override
    public int func1(int num1 ,int num2){
        return num1 + num2;
    }

    public int func2(int num1 ,int num2){
        return num1 + num2 + 9;
    }
}