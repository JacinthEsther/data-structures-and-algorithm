package binarySearch;

public class MountainArray {
    public static int search(int [] array, int target){
        int left = 0;
        int right = array.length -1;
        while (left <= right){
            int mid = (left+ right)/2;

             if (array[mid+1] < array[mid]){
                right = mid;
            }
            else{
                left = mid + 1;
             }
        }
        return left;
    }
}
