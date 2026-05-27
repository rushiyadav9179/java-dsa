public class CountVowels {
    public static void main(String[] args) {
        String s = "Rushikesh";
        boolean c = false;
        int count = 0;
        for(int i=0; i<s.length()-1; i++){
           if(s.charAt(i).equals('a') || s.equals('e' ) ||s.equals('i' ) ||s.equals('o' ) ||s.equals('u' )){
                    count++;
               }
        }
        System.out.println(count);
        
}
}
