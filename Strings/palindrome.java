import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size = ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements : ");

        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        int palindrome=1;
        int left=0;
        int right=size-1;
        while(left<right){
            if(arr[left]!=arr[right]){
                System.out.println("array is not palindrome...");
                palindrome=0;
                break;
            }
            left++;
            right--;
        }
        if(palindrome==1){
            System.out.println("array is palindrome...");
        }
        sc.close();
    }
}
