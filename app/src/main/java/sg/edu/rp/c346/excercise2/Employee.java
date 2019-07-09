package sg.edu.rp.c346.excercise2;

public class Employee {

  private String name;
  private String title;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String title, double salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    private double salary;

}
