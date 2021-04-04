import java.util.Scanner;

public class Chen_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Giá trị của mảng là (max = 20 ) : ");
        int size = scanner.nextInt();
        if (size > 20) {
            System.out.print("Mảng chỉ chứa tối đa 20 phần tử ");
            return;
        }
        int[] array;
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("nhập giá trị vào mảng ");
            array[i] = scanner.nextInt();
        }
        System.out.print("nhập phần tử cần chè vào mảng ");
        int x = scanner.nextInt();
        System.out.print("nhập vị trí cần chèn ");
        int y = scanner.nextInt();
        if (y>array.length-1){
            System.out.print("không chèn được phần tử vào mảng ");
            return;
        }
        for (int j = array.length-1;j>0;j--){
            array[j] = array[j-1];
            if (j-1==y){
                array[y]=x;
                break;
            }
        }
        for (int k : array) {
            System.out.print(k+" ");
        }
    }
}



