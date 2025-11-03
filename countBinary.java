package DSA_1;

// count the no of target element in the sorted array
public class countBinary {
    // for sorted array we always use binary search 
   public static void main(String[] args) {
        int [] arr={1,2,4,5,8,8,8,10,10,12,15,16,20};
        int target=8;
        int f=firstOccurance(arr,target);
        int l= lastOccurance(arr,target);
        int ans=l-f+1; // formula : (lastindex-firstindex)+1;
        System.out.println(ans);
    }
    // for checking the target value first occurance
    public static Integer firstOccurance(int[] arr,int target){
        int res=-1;
        if(arr.length ==0 ){
            return -1;
        }
        int start=0;int end=arr.length-1;int mid=0;
        while(start<=end){ 
            mid = start+(end-start)/2;
        if (arr[mid ]== target){
            res = mid;
            end=mid-1;

        }
        else if(arr[mid]<target){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
    return res;
    
}
// for checking the target value last occurance
public static Integer lastOccurance(int[] arr, int target){
     int res=-1;
        if(arr.length ==0 ){
            return -1;
        }
        int start=0;int end=arr.length-1;int mid=0;
        while(start<=end){ 
            mid = start+(end-start)/2;
        if (arr[mid ]== target){
            res = mid;
            start=mid+1;

        }
        else if(arr[mid]<target){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
    return res;
}
}
