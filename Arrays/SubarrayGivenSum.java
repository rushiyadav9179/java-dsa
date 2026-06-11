import java.util.Scanner;
public class SubarrayGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array = ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter elements = ");
        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target = ");
        int target = sc.nextInt();

        int sum=0;
        int i=0,j=0;
        while(j<size){
            sum = sum+arr[j];
            while(sum>target && i<=j){                     // Shrink window if sum > target
                sum=sum-arr[i];
                i++;
            }
            if(sum==target){                              //Check if target found
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                break;
            }
            j++;
        }
        sc.close();
    }
}
