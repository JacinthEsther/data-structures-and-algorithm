import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static void main(String[] args) {
        int [] newArray = {5, 3, 6, 2, 10};

//        System.out.println(Arrays.toString(selectionSort(newArray)));
    }

    public static int findSmallest(int[] arr){
        int smallest = arr[0];
        int smallestIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest){
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static List<Integer> selectionSort(int [] arr){
        List <Integer> newArray = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int smallest = findSmallest(arr);

//

        }
        return newArray;
    }
}
