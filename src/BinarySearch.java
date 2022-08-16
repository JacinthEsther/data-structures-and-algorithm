import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {


    int[] numArray = {5,10,15,20,25,30,35};

        System.out.println( search(numArray,35));
        System.out.println(search2(0,numArray.length-1,35,numArray));


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

    public static int search2(int start, int end, int key, int [] array){

        if (start == end){
            if(array[start] == key) return start;
            else return 0;
        }
        else {
            int mid = (start + end) / 2;
            if (array[mid] == key) return mid;
            else if (array[mid] > key) {
                search2(start, mid - 1, key, array);
            }

            return search2(mid + 1, end, key, array);
        }

    }
}


