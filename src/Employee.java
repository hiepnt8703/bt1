public class Employee {
    private  int id;
    private String  name;
    private int age;
    private String department;
    private String code;
    private  int salary_rate;

    public Employee(int id, String name, int age, String department, String code, int salary_rate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salary_rate = salary_rate;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSalary_rate() {
        return salary_rate;
    }

    public void setSalary_rate(int salary_rate) {
        this.salary_rate = salary_rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", code='" + code + '\'' +
                ", salaryRate=" + salary_rate +
                '}';
    }
}
