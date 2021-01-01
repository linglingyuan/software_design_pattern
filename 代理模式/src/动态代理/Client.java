package 动态代理;

public class Client {
    public static void main(String[] args) {
        Iteach teach = new DTeacher();
        ProxyFactory proxyFactory = new ProxyFactory(teach);
        Iteach proxy = (Iteach) proxyFactory.getProxyInstance();
        proxy.teach();
        System.out.println(proxyFactory.getProxyInstance());
        System.out.println(proxyFactory.getClass());
    }
}
