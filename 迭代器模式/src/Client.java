import jdk.nashorn.api.scripting.ScriptObjectMirror;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);
        Output output = new Output(collegeList);
        output.printCollege();
    }
}
