import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size = ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements = ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        
        int slow=0;
        for(int fast=1; fast<size; fast++){
            if(arr[slow]!=arr[fast]){
                slow++;
                arr[slow]=arr[fast];
            }
        }

        System.out.print("unique elements =");
        for(int i=0; i<=slow; i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
