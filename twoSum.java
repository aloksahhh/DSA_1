// leetcode twosum problem.
import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        int[] arr={2,7,11,14};
        int target=9;
        System.out.println(Arrays.toString(sum(arr,target)));
    }
    public static int[] sum(int[] arr, int target){
        int[] ans = new int[2];
         int end = arr.length-1;
         for(int i=0;i<arr.length-1;i++){
            for(int j=end;j>i;j--){
                if(arr[i]+arr[j] == target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
         }
         return ans;
    }
}

