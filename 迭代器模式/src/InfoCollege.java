import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {
    List<Department> departmentList;
    int num = 0;
    public InfoCollege(){
        departmentList = new ArrayList<>();
        addDepartment("java1","java1专业");
        addDepartment("php1","php1专业");
    }
    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departmentList.add(department);
        num += 1;
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
