import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
            int target =arr[0];   
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                target=arr[i];
            }
            
        }
        return target;


    }
}