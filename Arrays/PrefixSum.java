import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size = ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter elements : ");

        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        int[] prefix = new int[size];
        prefix[0]=arr[0];
        for(int i=1; i<size; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0; i<size; i++){
            System.out.print(prefix[i]+" ");
        }
    }
}
