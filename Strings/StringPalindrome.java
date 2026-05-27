
public class StringPalindrome {
    public static void main(String[] args) {
        String s = "madaam";
        int right = s.length()-1;
        boolean ispalendrome = true;

        for(int left=0; left<right; left++){
            if(s.charAt(right)!=s.charAt(left)){
                ispalendrome=false;
            }
                right--;
        }
        if(ispalendrome){
            System.out.println("it is a palendrome string");
        }
        else{
            System.out.println("it is not palendrome");
        }
    }
}
