package HomeworkSinceApril.HomeworkSchool;

public class Main {
    public static void main(String[] args) {
        Teacher hd1 = new HeadTeacher("Aram", "Aramyan", 150000, 1.5);
        System.out.println(hd1.getSalary());
        Teacher t1 = new Teacher("Petros", "Petrosyan", 150000);
        System.out.println(t1.getSalary());
        Teacher sd1 = new SchoolDirector("Poghos", "Poghosyan", 300000);
        System.out.println(sd1.getSalary());
    }
}
