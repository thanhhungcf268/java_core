import java.util.Scanner;

public class LinearEquationResolver12 {
    public static void main(String[] args) {
        double weight,height,bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight (in kilogram):");
         weight  = scanner.nextDouble();
        System.out.print("Your height (in meter):");
         height = scanner.nextDouble();
         bmi = weight/(height*height);
        if(bmi<18.5){
            System.out.printf("%-20.2f%s",bmi," Under wight !");
        }else if(bmi<25.0){
            System.out.printf("%-20.2f%s",bmi," Normal !");
        }else if(bmi<30.0){
            System.out.printf("%-20.2f%s",bmi," Over wight !");
        }else {
            System.out.printf("%-20.2f%s",bmi," Obese !");
        }
    }
}
