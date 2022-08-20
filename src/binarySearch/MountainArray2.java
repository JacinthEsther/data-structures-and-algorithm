package binarySearch;

public class MountainArray2 {
    public static void main(String[] args) {

    }
    int check(int [] arr, int target){
        int peak = search(arr);
        int firstTry = floor(arr, target,0, peak);
        if (firstTry != -1){
            return firstTry;
        }
        return floor(arr,target,peak+1,arr.length-1);
    }
    public static int search(int [] array){
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

    static int floor(int [] array , int target, int start, int end) {


        //floor is returning the highest value less than or equal to target

        boolean found = array[start]  < array[end];

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == target){
                return mid;
            }

            if(found) {
                if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {

                if (target > array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
