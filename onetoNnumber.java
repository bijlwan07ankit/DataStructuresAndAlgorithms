public class Solution {
    public static int[] printNos(int x) {
        // Create an array to store the numbers
        int[] arr = new int[x];
        
        // Call the recursive function to fill the array
        fillArray(arr, 1);
        
        // Return the array
        return arr;
    }
    
    // Recursive function to fill the array with numbers from 1 to x
    public static void fillArray(int[] arr, int count) {
        // Base case: if count reaches x + 1, return
        if (count == arr.length + 1) {
            return;
        }
        
        // Assign the current count to the array
        arr[count - 1] = count;
        
        // Recursively call the function with incremented count
        fillArray(arr, count + 1);
    }

    public static void main(String[] args) {
        // Example usage:
        int[] result = printNos(5);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}



// Problem statement
// You are given an integer ‘n’.



// Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.



// Example:
// Input: ‘n’ = 5

// Output: 1 2 3 4 5

// Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5].
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 5
// Sample Output 1 :
// 1 2 3 4 5
// Explanation Of Sample Input 1:
// The array contains all integers from 1 to 5 in ascending order.
// Sample Input 2:
// 2
// Sample Output 2:
// 1 2
// Explanation Of Sample Input 2:
// The array contains all integers from 1 to 2 in ascending order.
// Expected Time Complexity:
// The expected time complexity is O(n), where 'n' is the given integer.
// Constraints:
// 1 <= n <= 10^6

// Time Limit: 1-sec