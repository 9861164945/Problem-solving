import java.util.*;

class Ceiling {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements into array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();
        int ans = ceiling(arr, target);
        if (ans != -1) {
            System.out.println("The element is found at index " + ans);
        } else {
            System.out.println("The element is not found in the array.");
        }
    }

    static int ceiling(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return  start
        ; 
        
    }
}