import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a : ");
        double a = scanner.nextDouble();
        System.out.print("b : ");
        double b = scanner.nextDouble();
        System.out.print("c : ");
        double c = scanner.nextDouble();
        System.out.print("phương trình của bạn có dạng là " + a + "x + " + b + "="+c);
        if (a == 0) {
            if (b == 0) {
                System.out.println("chương trình vô số nghiệm");
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        } else {
            double answer = (c-b)/a;
            System.out.printf("\nphương trình có một nghiệm là :%s%.3f","",answer);
        }
    }
}
