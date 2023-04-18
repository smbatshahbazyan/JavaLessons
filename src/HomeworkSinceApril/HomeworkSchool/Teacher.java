package HomeworkSinceApril.HomeworkSchool;

public class Teacher {
    private String name;
    private String lastName;
    private double salary;

    Teacher(String name, String lastName, double salary) {
        setName(name);
        setLastName(lastName);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
