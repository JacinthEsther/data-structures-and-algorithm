//Given an array of positive integers.
// All numbers occur an even number of times except one number which occurs an odd number of times.
// Find the number in O(n) time & constant space.

import java.util.HashMap;

public class OddCountInAnArray {

    // function to find the element occurring odd
    // number of times
    static int getOddOccurrence(int[] arr, int arr_size) {
        int i;
        for (i = 0; i < arr_size; i++) {
            int count = 0;
            for (int j = 0; j < arr_size; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;

//        Time Complexity: O(n^2)
//
//Auxiliary Space: O(1)
    }

        // function to find the element occurring odd
        // number of times
        static int getOddOccurrenceUsingHashing(int[] arr, int n)
        {
            HashMap<Integer,Integer> hmap = new HashMap<>();

            // Putting all elements into the HashMap
            for(int i = 0; i < n; i++)
            {
                if(hmap.containsKey(arr[i]))
                {
                    int val = hmap.get(arr[i]);

                    // If array element is already present then
                    // increase the count of that element.
                    hmap.put(arr[i], val + 1);
                }
                else

                    // if array element is not present then put
                    // element into the HashMap and initialize
                    // the count to one.
                    hmap.put(arr[i], 1);
            }

            // Checking for odd occurrence of each element present
            // in the HashMap
            for(Integer a:hmap.keySet())
            {
                if(hmap.get(a) % 2 != 0)
                    return a;
            }
            return -1;

//            Time Complexity: O(n)
//
//              Auxiliary Space: O(n)
        }

    int getOddOccurrenceUsingXor(int[] ar, int ar_size)
    {
        int i;
        int res = 0;
        for (i = 0; i < ar_size; i++)
        {
            res = res ^ ar[i];
        }
        return res;

//        Time Complexity: O(n)
//
//Auxiliary Space: O(1)
    }


    // driver code
    public static void main(String[] args)
    {
        int[] arr = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
        int n = arr.length;
        System.out.println(getOddOccurrence(arr, n));
    }
}
