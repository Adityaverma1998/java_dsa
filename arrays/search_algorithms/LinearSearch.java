package arrays.search_algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 78, 54, 2, 12};
        int target = 54;
        System.err.println("Search items are " + linearSearch(arr, target));

        
       
    }

    public static int linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
           if(arr[i] == target){
            return i;
           }
        }
        return -1;
    }
}
