//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class InsertionSort {

    public static int[] sort(int[] arr) {
        int N = arr.length;

        for(int i = 1; i < N; ++i) {
            int j = i;

            int temp;
            for(temp = arr[i]; j > 0 && temp < arr[j - 1]; --j) {
                arr[j] = arr[j - 1];
            }

            arr[j] = temp;
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insertion Sort\n");
        System.out.println("Enter number of integer elements");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("\nEnter " + n + " integer elements\n");

        int i;
        for(i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        sort(arr);
        System.out.println("\nElements after sorting ");

        for(i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
