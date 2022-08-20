package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstAndLastPositionOfElementInSortedArray {

    static int[] searchRange(int [] nums, int target){
        int [] ans = {-1,-1};
        ans[0] = floor(nums,target,true);
        if (ans[0] != -1) {
            ans[1] = floor(nums, target, false);
        }

        return ans;
    }
    static int floor(int [] array , int target, boolean found){

        int a = -1;
        //floor is returning the highest value less than or equal to target
        int start = 0;
        int end = array.length-1;

        while (start <= end){
            int mid = (start+ end)/2;

             if (target < array[mid]){
                end = mid -1;
            }
            else if (target > array[mid]){
                 start = mid + 1;
             }

            else {
                a = mid;
                if(found){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return a;
    }

}
