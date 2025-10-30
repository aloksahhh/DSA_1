package DSA_1;

import java.util.*;
public class selectionSort{
    public static void main(String[] args){
        int[] arr={4,8,2,-9,64,100,0,-45,98,4,8};

        for(int i=0;i<arr.length;i++){
             int last=arr.length-i-1;
             int maximum= getMaxInt(arr,0,last);
             swap(arr,maximum,last);
             
        }
        
        System.out.println(Arrays.toString(arr));
    }

    public static Integer getMaxInt(int[] arr,int first,int last){
        int max = first;
        for(int i=0;i<last;i++){
            if(arr[max]<arr[i]){
                max= i;
            }
        }
        return max;



    }
    public static void swap(int[] arr,int max,int last){
        int temp= arr[max];
        arr[max]= arr[last];
        arr[last]=temp;
    }

}
