package binarySearch;

public class PositionOfAnElementOfInfiniteNumbers {

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return search(arr,target,start,end);
    }
    public static int search(int [] array, int target, int start, int end){

        while (start <= end){
            int mid = (start+ end)/2;
            if (array[mid]== target){
                return mid;
            }
            else if (target < array[mid]){
                end = mid -1;
            }
            else start= mid+1;
        }
        return -1;
    }
}
