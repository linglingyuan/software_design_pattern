import java.util.HashMap;

public class WebsiteFactory {
    private static HashMap<String,ConcreteWebsite> pool = new HashMap<>();
    public website getWebsite(String type){
        if (!pool.containsKey(type)){
            pool.put(type,new ConcreteWebsite(type));
        }
        return (website)pool.get(type);
    }
    public static int getSize(){
        return pool.size();
    }
}
