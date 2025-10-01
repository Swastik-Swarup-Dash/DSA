package Two_Pointers;

public class remove_Duplicates {
    public static void main(String[] args) {
        remove_Duplicates rd =  new remove_Duplicates();
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int k = rd.removeDuplicates(arr);
        System.out.println(k);
    }
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int j = 0;
        for(int i = 1 ; i<n ; i++){
            if(arr[i]!=arr[j]){
                arr[j+1]=arr[i];
                j++;
            }
        }
        return j+1;
    }
}
