import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số lượng phần tử phần tử (tối đa 20) : ");
        int size = scanner.nextInt();
        if (size >20){
            System.out.print("Tối đa 20");
            return;
        }
        array = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("nhập phần tử thứ "+i+" :");
            array[i] = scanner.nextInt();
        }
        int index = 0;
        int max = array[0];
        for (int k : array){
            if (max<k){
                index++;
                max = k;
            }
        }
        System.out.print("phần tử có giá trị lớn nhất là :"+max+ " ở vị trí "+ index);
    }

}
