import java.util.Scanner;

public class Delete_Array {
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
        System.out.print("nhập phần tử cần xóa ");
        int x = scanner.nextInt();
        for (int j = 0; j < array.length; j++) {
            if (x == array[j]) {
                if (array.length - 1 - j >= 0)
                    System.arraycopy(array, j + 1, array, j, array.length - 1 - j);
            }
        }
        for (int k : array) {
            System.out.print(k+" ");
        }
    }
}



