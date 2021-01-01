public class ConcreteWebsite extends website {
    private String type = "";

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站类型" + type + user.getName() +" 在使用中！");
    }
}
