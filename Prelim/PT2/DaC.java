import java.util.*;

public class DaC {
    public static void mergeSort(int[] arr) {
        
        if (arr.length <= 1) {
            return; 
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);  
        mergeSort(right); 

        merge(arr, left, right); 
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static int binarySearch(int[] arr, int target) {
        return binarySearchRecursive(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; 
        }

        int mid = low + (high - low) / 2; 
        if (arr[mid] == target) {
            return mid; 
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, high); 
        } else {
            return binarySearchRecursive(arr, target, low, mid - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Unsorted array: " + Arrays.toString(arr));

        mergeSort(arr);
        System.out.println("Sorted array (Merge Sort): " + Arrays.toString(arr));

        System.out.print("Enter the target value to search for: ");
        int target = scan.nextInt();

        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Found " + target + " at index " + index);
        } else {
            System.out.println(target + " not found.");
        }
        
    }
}
