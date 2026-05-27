import java.util.Scanner;
public class Countodd{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements:");
        
        for(int i = 0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        int count=0;
        for(int i = 0; i<size; i++){
           if(arr[i]%2!=0){
            count++;
           }
        }
        System.out.println("odd count = "+count);
        sc.close();
    }
}