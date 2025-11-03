package DSA_1;

public class elementInRotated {
    public static void main(String[] args) {
        int [] arr={11,12,14,18,21,25,44,2,4,6,8};
        int target=14;
        
        int ans= count(arr);
        int a = findNumber(arr,target,ans);
        System.out.println(a);
        
    }
      public static Integer findNumber(int[] arr,int target,int ans){
        int start =0; int end = arr.length-1;; int mid =0;
        if(ans == -1){
            return -1;}
        if(arr[ans] == target){
            return target;
        }
        else if(arr[ans]<target){
            end= ans-1;}
        else{
            start = ans+1;
        }
        
         
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
     return -1;   
        

      }





    public static Integer count(int[] arr){
        
        if(arr.length ==0 ){
            return -1;
        }
        int start=0;int end=arr.length-1;int mid=0;
        
        int l=arr.length;
        while(start<=end){ 
            mid = start+(end-start)/2;
            int right = (mid+l-1)%l;//to calculate right side index no of mid
            int left =(mid+1)%l;// to calculate the left side index of mid 
        if (arr[mid ]<= arr[left] && arr[mid]<= arr[right]){ // if mid is less than both side then the index no is the answer.
            return mid;
            

        }
        else if(arr[mid]>=arr[end]){//for checking the unsorted part.
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return -1;
    
}
}
