//remove duplicate numbers from the array leetcode problem.
import java.util.*;
public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr= {0,0,1,1,1,2,2,3,3,4};
        int[] res = remove(arr);
        System.out.println(Arrays.toString(res));
        
    }
    public  static int[] remove(int[] nums) {
        int start=0; int end=1; int len = nums.length;
        int[] ans=new int[len]; int x=0;
        while(end<len){
            if(nums[start]==nums[end]){
               
                end++;
            }
            else{
                ans[x]=nums[start];
                x++;
                start=end;
                end++;
            }
        }
        ans[x++]=nums[start];
        return ans;
    }
    
}
