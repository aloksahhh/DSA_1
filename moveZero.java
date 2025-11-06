// move all zero to the end of an array(using two pointers).
import java.util.*;
public class moveZero {
    public static void main(String[] args) {
        int[] arr ={2,0,5,0,6,7,0};
        int left=0;
        for (int right=0; right<arr.length;right++){
            if(arr[right]!=0){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
