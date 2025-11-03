package DSA_1;

public class nearlySorted {
     public static void main(String[] args) {
        int [] arr={10,30,20,50,40};
        int target=20;
        int ans=findElement(arr,target);
        System.out.println(ans);
        
    }
    public static Integer findElement(int[] arr,int target){
        if(arr.length ==0 ){
            return -1;
        }
        int start=0;int end=arr.length-1;int mid=0;
        while(start<=end){ 
            mid = start+(end-start)/2;
        if (arr[mid ]== target){
            return mid;
        }
        if( arr[mid-1]== target){
            return mid;
        }
        if(arr[mid+1]== target){
            return mid;
        }
        if(mid>start && arr[mid]>target){
             end=mid-2;
        }else if(mid<end && arr[mid]<target){
            start=mid+2;
        }
    }
    return -1;
}
}
