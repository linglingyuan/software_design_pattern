public abstract class AbstractClass {
    final void make(){
        select();
        if (customerWantCondiment()){
            add();
        }
        soak();
        beat();
    }
    public  void select(){
        System.out.println("黄豆");
    }
    public abstract void add();
    public  void soak(){
        System.out.println("浸泡");
    }
    public void beat(){
        System.out.println("打碎");
    }
    //钩子方法
    abstract boolean customerWantCondiment();
}
