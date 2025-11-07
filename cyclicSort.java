//package DSA_1;
import java.util.*;

public class cyclicSort{
    public static void main(String[] args){
    int[] arr= {3,5,4,1,2};
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!= correct){
                swap(arr,i,correct);
            }
            
                i++;
            
        }
         System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int first,int last){
        int temp= arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
