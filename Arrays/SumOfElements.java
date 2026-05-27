import java.util.Scanner;
public class SumOfElements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        System.out.println("Enter elements:");
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i = 0; i<size; i++){
            sum=sum+arr[i];
        }
        System.out.println("sum = "+sum);
        sc.close();
    }
}