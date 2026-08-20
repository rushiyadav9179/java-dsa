class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEquals("")){
            return false;
        }
        int j=0;
        for(int i=0; i<t.length(); i++){
            if(j == s.length()-1 && t.charAt(i) == s.charAt(j)){
                return true;
            }
            else if(t.charAt(i) == s.charAt(j)){
                j++;
            }
        }
        return false;
    }
}