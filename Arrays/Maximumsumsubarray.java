import java.util.Scanner;
public class Maximumsumsubarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter elements:");
        for(int i = 0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of K = ");
        int k = sc.nextInt();
         
        int max=Integer.MIN_VALUE;
        int sum=0;
        int i=0,j=0;
        while(j<size-1){
            sum=sum+arr[j];
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1==k){
                max = Math.max(max, sum);
                sum = sum - arr[i];
                j++;
                i++;
            }
        }
        System.out.println(max);
        sc.close();
    }
}

// this is also a good approch to solve this problem... :-
// int k = 3;
// int sum = 0;

// // first window
// for(int i = 0; i < k; i++){
//     sum += arr[i];
// }

// int max = sum;

// // slide window
// for(int i = k; i < arr.length; i++){
//     sum += arr[i];
//     sum -= arr[i - k];
//     max = Math.max(max, sum);
// }

// System.out.println(max);