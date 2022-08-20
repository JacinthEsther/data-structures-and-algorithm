package binarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int [] array = {2,3,5,9,14,16,18};
        int target = 15;
        //ceiling means the smallest element in an array greater or equals to the target array.
        System.out.println("The index of the highest value greater than the target array is "+ ceiling(array,target));
        System.out.println("The index of the highest value less than the target array is "+ floor(array,target));
        System.out.println(smallest(array,16));
    }

    static int ceiling(int [] array , int target){
        int start = 0;
        int end = array.length-1;

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
        return start;
    }

    static int floor(int [] array , int target){

        //floor is returning the highest value less than or equal to target
        int start = 0;
        int end = array.length-1;

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
        return end;
    }

    static int smallest(int [] array , int target){

        //floor is returning the highest value less than or equal to target
        int start = 0;
        int end = array.length-1;

        while (start <= end){
            int mid = (start+ end)/2;

             if (target < array[mid]){
                end = mid -1;
            }
            else start= mid+1;
        }
        return array[ start % array.length];
    }


}
