import java.util.Iterator;
import java.util.List;

public class Output {
    List<College> collegeList;
    public Output(List<College> collegeList){
        this.collegeList = collegeList;
    }
    public void printCollege(){
        Iterator iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = (College) iterator.next();
            System.out.println("===" + college.getName() + "===");
            printDepartment(college.createIterator());
        }
    }
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
