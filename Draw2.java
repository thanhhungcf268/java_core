import java.util.Scanner;

public class Draw2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1 -> {
                    System.out.println("Print the rectangle");
                    for (int i =0;i<3;i++){
                        for (int j =0;j<5;j++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }

                }
                case 2 -> {
                    System.out.println("Print the square triangle");
                   for (int i =1;i<=5;i++){
                       for (int j = 0;j<i;j++){
                           System.out.print("* ");
                       }
                       System.out.print("\n");
                   }
                }
                case 3 -> {
                    System.out.println("Print isosceles triangle");
                    for (int i =5;i>=1;i--){
                        for (int j = 1;j<=i;j++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                }
                default -> {
                    System.out.println("No choice!");
                }
            }
            choice = input.nextInt();
        }

    }

}

