package scau;

public class test{
    public static void main(String[] args) {
       Student stu = Student.StudentBuilder.aStudent().withAge(18).withName("jielin").withSex(2).build();
        System.out.println(stu.getSex());
    }
}
class Student{
    private String name;
    private int age;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public static final class StudentBuilder {
        private String name;
        private int age;
        private int sex;

        StudentBuilder() {
        }

        public static StudentBuilder aStudent() {
            return new StudentBuilder();
        }

        public StudentBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder withSex(int sex) {
            this.sex = sex;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.setName(name);
            student.setAge(age);
            student.setSex(sex);
            return student;
        }
    }
}