//package DSA_1;

// order dignostic binary search(first find weather the array is in ascending or descending order).

public class binarySearch {
 
    public static void main(String[] args) {
        int [] arr={20,16,15,14,13,11,9,8,6,5,4,3,1};
        int target=8;
        int ans=binary(arr,target);
        System.out.println(ans);
        
    }
    public static Integer binary(int[] arr,int target){
        if(arr.length ==0 ){
            return -1;
        }
        int first =0;
        int last=arr.length-1;
        int start=0;int end=arr.length-1;int mid=0;
        if(arr[first]>arr[last]){
        while(start<=end){ //descending order
            mid = start+(end-start)/2;
        if (arr[mid ]== target){
            return mid;

        }
        else if(arr[mid]>target){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
}
else{
    while(start<=end){ // ascending order
            mid = start+(end-start)/2;
        if (arr[mid ]== target){
            return mid;

        }
        else if(arr[mid]>target){
             end=mid-1;
        }else{
            start=mid+1;
        }
    }
}
return -1;
    }
}

