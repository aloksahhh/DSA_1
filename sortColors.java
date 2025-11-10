import java.util.*;
public class sortColors {
    public static void main(String[] args) {
        int[] arr= {2,0,2,1,1,0};
        int l = arr.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}

