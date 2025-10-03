package Sliding_Window;

import java.util.HashMap;

public class Contains_Duplicate2 {
    public static void main(String[] args) {
           Contains_Duplicate2 cd = new Contains_Duplicate2();
           int nums[] = {1,2,3,1};
           int k = 3;
           boolean result = cd.containsNearbyDuplicate(nums,k);
           System.out.println(result);
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            int v = nums[i];
            if(map.containsKey(v) && i - map.get(v)<=k){
                return true;
            }
            map.put(v,i);
        }
        return false;
    }
}
