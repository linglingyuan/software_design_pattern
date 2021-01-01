public class Client {
    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();
        websiteFactory.getWebsite("博客");
        websiteFactory.getWebsite("新闻");
        websiteFactory.getWebsite("新闻").use(new User("Tom"));
        websiteFactory.getWebsite("新闻").use(new User("nike"));
        websiteFactory.getWebsite("新闻").use(new User("saarh"));
        System.out.println(websiteFactory.getSize());
    }
}
