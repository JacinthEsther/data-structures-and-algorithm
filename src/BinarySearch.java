import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {


    int[] numArray = {5,10,15,20,25,30,35};

        System.out.println( search(numArray,35));


}

public static int search(int [] array, int target){
        int left = 0;
        int right = array.length -1;
        while (left <= right){
            int mid = (left+ right)/2;
            if (array[mid]== target){
                return mid;
            }
            else if (target < array[mid]){
                right = mid -1;
            }
            else left= mid+1;
        }
        return -1;
}
}


