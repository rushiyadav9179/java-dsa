import java.util.Scanner;
public class MoveZerosEnd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter elements:");
        for(int i = 0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        
        int slow = 0;
        int temp;
        for(int fast=0;fast<size-1;fast++){
            if(arr[fast]!=0){
                temp=arr[fast];
                arr[fast]=arr[slow];
                arr[slow]=temp;
                slow++;
            }
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}