import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size = ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements = ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        int left=0;
        int right=size-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }

    }
}
