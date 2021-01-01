import java.util.Collections;
import java.util.Iterator;

public class ComputerCollege implements College {
    Department[] departments;
    int num = 0;
    public ComputerCollege(){
        departments = new Department[5];
        addDepartment("java","java专业");
        addDepartment("php","php专业");
    }
    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[num] = department;
        num += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
