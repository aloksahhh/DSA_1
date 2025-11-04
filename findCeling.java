public class findCeling {
    public static void main(String[] args) {
        int [] arr={2,3,4,7,10,12,15,18,20,22,26};
        int target=16;
        int ans=findElement(arr,target);
        System.out.println(ans);
        
    }
    public static Integer findElement(int[] arr,int target){
        if(arr.length ==0 ){
            return -1;
        }
        int start=0;int end=arr.length-1;int mid=0; int res =0;
        while(start<=end){ 
            mid = start+(end-start)/2;
        if (arr[mid ]== target){
             res =arr[mid];
             return res;
        }
        else if(arr[mid]<target){
            
            start = mid+1;
        }
        else{
            res =arr[mid];
            end = mid-1;
        }
    }
    return res;
}
}
