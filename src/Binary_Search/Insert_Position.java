package Binary_Search;

public class Insert_Position {
    public static void main(String[] args) {
        Insert_Position ip = new Insert_Position();
        int[] nums = {1,3,5,6};
        int target = 5;
        int result = ip.searchInsert(nums,target);
        System.out.println(result);


    }
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target) return m;
            else if(target>nums[m]) s = m+1;
            else e = m - 1;

        }
        return s;
    }
}
