import java.util.Scanner;

public class Chuyen_Tien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số tiền bạn muốn chuyển :");
        int dollars = scanner.nextInt();
        int vnd = dollars *23700;
        System.out.print("Số tiền sau khi chuyển là : "+vnd+" VND");
    }
}
