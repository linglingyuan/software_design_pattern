public class Client {
    public static void main(String[] args) {
        new TeacherProxy(new Teacher()).teach();
    }
}
