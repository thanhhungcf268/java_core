import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        int number = scanner.nextInt();
        String b, a, c, f, cc,aa;
        char nm = 0, mk = 0, nn = 0;
        String n = Integer.toString(number);
        if (n.length() > 0) {
            mk = n.charAt(0);
        }
        if (n.length() > 1) {
            nm = n.charAt(1);
        }
        if (n.length() > 2) {
            nn = n.charAt(2);
        }
        if (number < 20 && number >= 10) {
            a = switch (number) {
                case 11 -> ("eleven");
                case 12 -> ("twelve");
                case 13 -> ("thirteen");
                case 14 -> ("fourteen");
                case 15 -> ("fifteen");
                case 16 -> ("sixteen");
                case 17 -> ("seventeen");
                case 18 -> ("eighteen");
                case 19 -> ("nineteen");
                default -> ("ten");
            };
            System.out.println(a);
        }
        cc = switch (nn) {
            case '1' -> ("eleven");
            case '2' -> ("twelve");
            case '3' -> ("thirteen");
            case '4' -> ("fourteen");
            case '5' -> ("fifteen");
            case '6' -> ("sixteen");
            case '7' -> ("seventeen");
            case '8' -> ("eighteen");
            case '9' -> ("nineteen");
            default -> ("sai rồi");
        };
        f = switch (nn) {
            case '1' -> ("one");
            case '2' -> ("two");
            case '3' -> ("three");
            case '4' -> ("four");
            case '5' -> ("five");
            case '6' -> ("six");
            case '7' -> ("seven");
            case '8' -> ("eight");
            case '9' -> ("nine");
            default -> ("uu");
        };
        b = switch (mk) {
            case '1' -> ("one");
            case '2' -> ("two");
            case '3' -> ("three");
            case '4' -> ("four");
            case '5' -> ("five");
            case '6' -> ("six");
            case '7' -> ("seven");
            case '8' -> ("eight");
            case '9' -> ("nine");
            default -> ("uu");
        };
        c = switch (nm) {
            case '2' -> ("twenty");
            case '3' -> ("thirty");
            case '4' -> ("forty");
            case '5' -> ("fifty");
            case '6' -> ("sixty");
            case '7' -> ("seventy");
            case '8' -> ("eighty");
            case '9' -> ("ninety");
            default -> ("a");
        };
        aa = switch (mk) {
            case '2' -> ("twenty");
            case '3' -> ("thirty");
            case '4' -> ("forty");
            case '5' -> ("fifty");
            case '6' -> ("sixty");
            case '7' -> ("seventy");
            case '8' -> ("eighty");
            case '9' -> ("ninety");
            default -> ("a");
        };
        if (number < 10) {
            System.out.println(b);
        }
        if (number > 19 && number < 100) {
            if (nm=='0'){
                System.out.print(aa);
            }else {
                System.out.print(b+" - "+c);
            }
        }
        if (number==100){
            System.out.print("one hundred");
        }
        if (number>100&&number<120){
            System.out.print(b + " hundred "+ cc);
        }
        if (number > 119) {
            if (nn=='0'){
                System.out.print(b + " hundred " + c);
            }else {
                System.out.print(b + " hundred " + c + " - " + f);
            }
        }
    }
}