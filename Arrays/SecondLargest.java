import java.util.Scanner;
public class Second{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements:");
        
        for(int i = 0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>slargest && arr[i]!=largest){
                slargest=arr[i];
            }
        }

        System.out.println("Second largest = "+slargest);
        sc.close();
    }
}
