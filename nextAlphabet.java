public class nextAlphabet {
     public static void main(String[] args) {
        char[] arr={'a','e','i','o','u'};
        char target='c';
        int ans=findElement(arr,target);
        System.out.println(ans);
        
    }
    public static Integer findElement(char[] arr,char target){
        if(arr.length ==0 ){
            return -1;
        }
        int start=0;int end= arr.length-1;int mid=0; int res=0;
        while(start<=end){ 
            mid = start+(end-start)/2;
        if (arr[mid ]== target){
             start = mid+1;
        }
        else if(arr[mid] < target){
            
            start = mid+1;
        }
        else{
            res =mid;
            end = mid-1;
        }
    }
    return res;
}
}
