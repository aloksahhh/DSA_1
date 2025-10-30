package DSA_1;

import java.util.*;
public class insertionSort{
    public static void main(String[] args){
        int[] arr={0,-8,76,4,65,-87,7,5,-16,69};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int first,int last){
        int temp= arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}

