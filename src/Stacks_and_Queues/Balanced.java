package Stacks_and_Queues;

public class Balanced {
    public static void main(String[] args) {
      Balanced b = new Balanced();
      boolean result = b.checkValidString("(*)))");
      System.out.println(result);
    }

    public boolean checkValidString(String s) {
        int c1 = 0, c2 =0;
        for(int i = 0 ; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                c1++;
                c2++;
            }else if(c==')'){
                c1--;
                c2 = Math.max(c2-1,0);
            }else{
                c1++;
                c2 = Math.max(c2-1,0);
            }
            if(c1<0) return false;
        }
        return c2==0;
    }
}
