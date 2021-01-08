public class Adaptee {
    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter(){
            @Override
            public void m1(){
                System.out.println("我只需要使用m1.所以只重写m1");
            }
        };
        abstractAdapter.m1();
    }
}
