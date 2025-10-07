package Binary_Search;

public class Guess_Number_Higher_or_Lower {
    public static void main(String[] args) {
        Guess_Number_Higher_or_Lower gn = new Guess_Number_Higher_or_Lower();
        int n = 10;
        int result = gn.guessNumber(n);
        System.out.println(result);
    }
    public int guessNumber(int n) {
        int s = 1;
        int e = n;
        while(s<=e){
            int m = s+(e-s)/2;
            int g = guess(m);
            if(g==0) return m;
            else if(g==1) s = m+1;
            else e = m-1;
        }
        return -1;
    }
    //dummy function
    public int guess(int num){
        int pick = 6;
        if(num==pick) return 0;
        else if(num<pick) return 1;
        else return -1;
    }
}
