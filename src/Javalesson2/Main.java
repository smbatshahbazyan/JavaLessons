public class Main {
    public static void main(String[] args) {
        //Homework 1................

        int x = 18;
        int y = 5;
        System.out.println((x / y) == 1.0 * x / y);
        //Answer is false

        int x1 = 15;
        int y1 = 5;
        System.out.println((x1 / y1) == 1.0 * x1 / y1);
        //Answer is true

        //Homework 2................

        int a = 10;
        int b = 15;
        int c = 16;
        int d = 20;
        int e = 25;
        int f = 26;
        double g = (1.0 * (a + b + c) / 3);
        double h = (1.0 * (d + e + f) / 3);

        System.out.println(g);
        System.out.println(h);
        System.out.println((int) (g + h));


    }
}