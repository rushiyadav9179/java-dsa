package Sorting;
class MergeSort{

    public static void divide(int[] arr,int low,int high){

        if(low<high){
            int mid=low+(high-low)/2;

            divide(arr,low,mid);
            divide(arr,mid+1,high);
            marge(arr,low,mid,high);
        }
    }

    public static void marge(int[] arr,int low,int mid,int high){

        int n1=mid-low+1;
        int n2=high-mid;

        int[] left=new int[n1];
        int[] right=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }

        
    }

    public static void main(String[] args){
        int[] arr={3,5,1,4,6,2};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        divide(arr,0,arr.length-1);

        System.out.println("\nAfter sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}