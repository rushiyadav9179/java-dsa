import java.util.Scanner;
public class TowSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        System.out.print("Enter elements:");
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target = ");
        int target = sc.nextInt();

        int left = 0;
        int right = size-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                System.out.print("true "+arr[left]+" + "+arr[right]+" = "+sum);
                break;
            }
            else if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
        }
    }
}