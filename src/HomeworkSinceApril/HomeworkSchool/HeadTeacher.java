package HomeworkSinceApril.HomeworkSchool;

public class HeadTeacher extends Teacher {
    boolean isUsed = false;
    private double coefficient;

    public HeadTeacher(String name, String lastName, double salary, double coefficient) {
        super(name, lastName, salary);
        setCoefficient(coefficient);
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        if (!isUsed) {
            if (coefficient >= 1.5 && coefficient <= 2) {
                this.coefficient = coefficient;
                isUsed = true;
            } else {
                System.out.println("Coefficient should be in range 1.5-2");
                System.exit(2);
            }
        } else {
            System.out.println("Coefficient already established");
        }
    }

    @Override
    public double getSalary() {
        return super.getSalary() * getCoefficient();
    }
}
