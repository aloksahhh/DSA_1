package DSA_1;

import java.util.*; 

public class linearSearch {
    public static void main(String[] args){
    int[][] arr={{2,3,4,5},
                {45,8,7},
                {6,56,88,0}
    };
    //int target=45;
    int ans =linear2DMin(arr);
    System.out.println(ans);    
}
// Search in array
    public static Integer linear(int[] array, int tar){
        if(array.length == 0){
            return -1;
        }
        for(int i=0;i<array.length;i++){
            if(array[i] == tar){
                return i;
            }
        }
        return -1;

}
// Search in String
 public static boolean linearString(String arra, char tar){
        if(arra.length() == 0){
            return false;
        }
        for(int i=0;i<arra.length();i++){
            char ch = arra.charAt(i);
            if(ch == tar){
                return true;
            }
        }
        return false;

}
// Search in Range
 public static Integer linearRange(int[] array, int tar,int start,int end){
        if(array.length == 0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(array[i] == tar){
                return i;
            }
        }
        return -1;

}
// Search the maximum in range
public static Integer linearRangeMax(int[] array, int start,int end){
        if(array.length == 0){
            return -1;
        }
        int max = Integer.MIN_VALUE;// for minimun change the int to min = Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            if(array[i]>max){//if(array[i]<min)
                max = array[i];//min=array[i];
            }
        }
        return max;//return min;

}
// Searching in 2D arrays
public static int[] linear2D(int[][] arr,int target){
     for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
                
}

   
}
return new int[]{-1,-1};
}
//Searching minimum in 2D arrays.
public static int linear2DMin(int[][] arr){
    int min=Integer.MAX_VALUE;
     for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] <min){
                     min= arr[i][j];
                }
                
}

   
}
return min;

}
}