import javax.smartcardio.TerminalFactory;

public class TeacherProxy implements ITeach{
    private ITeach teacher;
    public TeacherProxy(ITeach teacher){
        super();
        this.teacher = teacher;
    }
    @Override
    public void teach() {
        System.out.println("开始代理");
        teacher.teach();
        System.out.println("代理结束");
    }
}
