package Two_Pointers;

// * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
// * Example 1:
// * Input: s = "abca"
// * Output: true
// * Explanation: You could delete the character 'c'.
// *
// * Example 2:
// * Input: s = "abc"
// * Output: false
// *
// * Constraints:
// * 1 <= s.length <= 10^5
// * s consists of lowercase English letters.
//
public class Valid_Palindrome2 {
    public static void main(String[] args) {
        Valid_Palindrome2 vp = new Valid_Palindrome2();
        String s = "abca";
        boolean result = vp.validPalindrome(s);
        System.out.println(result);
    }
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return IsPal(s,i+1,j) || IsPal(s,i,j-1);}
            i++;
            j--;
        }
        return true;
    }
    private boolean IsPal(String s , int i , int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
