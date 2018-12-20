import java.util.Random;
import java.util.Scanner;

public class searchArrayDemo {

    private static int binarySearch(int[] array, int search) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (search < array[middle]) {
                end = middle - 1;
            }

            if (search > array[middle]) {
                start = middle + 1;
            }

            if (search == array[middle]) {
                return middle;
            }
        }
        return -1;
    }

    // This function returns index of element x in arr[]
    private static int search(int arr[],int x)
    {
        for (int i = 0; i < arr.length; i++) {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }

        // return -1 if the element is not found
        return -1;
    }


    // Driver method to test above
    public static void main(String args[])
    {
        int c, n, array[];
        InsertionSort insSort = new InsertionSort();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        n = in.nextInt();

        array = new int[n];

        Random rand = new Random();

        for (c = 0; c < n; c++)
        {
            array[c] = rand.nextInt(100);
        }

        int[] sortedArray = insSort.sort(array);

        System.out.println("Elements: ");

        for (int i = 0; i < sortedArray.length; i++)
        {
            System.out.print(sortedArray[i] + " ");
        }



        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the element to be searched: ");

        int k = sc.nextInt();

            System.out.println("\nSelect type of search\n");
            System.out.println("1. Binary search");
            System.out.println("2. Sequential search");

        int choice = in.nextInt();
        int binarySearchResult = binarySearch(sortedArray, k);
        int sequentialSearchResult = search(sortedArray, k);
        switch(choice) {
            case 1:
                if (binarySearchResult == -1) {
                    System.out.println("\n" + k + " element not found");
                }
                else {
                    System.out.println("\n"+ k +" element found at position "+ binarySearchResult);
                }
                break;
            case 2:
                if (sequentialSearchResult == -1) {

                    System.out.println(sequentialSearchResult + "");
                    System.out.println("\n" + k + " element not found");
                }
                else {
                    System.out.println("\n" + k + " element found at position " + sequentialSearchResult);
                }
                break;
    }
}
}
