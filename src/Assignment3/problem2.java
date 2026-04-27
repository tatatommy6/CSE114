package Assignment3;
//Minkyeol Kim

public class problem2 { 
    /* 
    fuction: reverseArray
    Reverses the contents if a[low] up to a[high].
    Example: if a is {2, 4, 6, 8},
    then after calling reverse(a, 0, 3),
    a would be {8, ,6, 4, 2}.
    */
    public static void reverseArray(int [] a, int low, int high){
        // Base case
        // When low index meets or passes high index,
        // it means we have processed all elements.
        // So no mere swaps are needed and recursion stops.
        if(low >= high){
            return;
        }
    
        // Swap the elements at the current low and high indices.
        int temp = a[low];
        a[low] = a[high];
        a[high] = temp;

        // recursive
        // Move towards the middle of the array by 
        // incresing low and decresing high.
        reverseArray(a, low + 1, high - 1);
    }
    public static void main(String[] args) {
        int []arr = {2, 4, 6, 8};
        // call the function to reverse the array
        reverseArray(arr, 0, arr.length - 1);

        // print the reversed array
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}