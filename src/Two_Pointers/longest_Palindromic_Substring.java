package Two_Pointers;

public class longest_Palindromic_Substring {
    public static void main(String[] args) {
        longest_Palindromic_Substring lps = new longest_Palindromic_Substring();
        String s = "babad";
        String result = lps.longestPalindrome(s);
        System.out.println(result);
    }

    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int max = 1;
        String maxstr = s.substring(0,1);

        for(int i = 0 ; i<s.length() ; i++){
            for(int j = i + max ; j<=s.length() ; j++){
                if(j-i>max && isPal(s.substring(i,j))){
                    max = j-i;
                    maxstr = s.substring(i,j);
                }
            }
        }
        return maxstr;

    }

    private Boolean isPal(String str){
        int st = 0;
        int e = str.length()-1;
        while(st<e){
            if(str.charAt(st)!=str.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}
