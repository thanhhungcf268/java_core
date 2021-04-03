import java.util.Scanner;

public class Find_Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the prime number to find : ");
//        int choice = input.nextInt();
        int check = 0;
//        int count = 0;
//        boolean check1 = true;
        for (int i = 2; i<100; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    check++;
                }
            }
            if (check == 1) {
//                count++;
                System.out.print(i + " ");
//                if (count == choice) {
//                   check1 = false;
//                }
            }
            check = 0;
        }
    }

}

