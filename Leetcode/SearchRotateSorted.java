package Leetcode;

//Leetcode No.33
public class SearchRotateSorted {
    public static int Search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target < arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    // 2nd way of solve this problem by the recursive
    public static int Searching(int arr[], int si, int ei, int target) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[si] < arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return Searching(arr, si, mid - 1, target);
            } else {
                return Searching(arr, mid + 1, ei, target);
            }
        } else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return Searching(arr, mid + 1, ei, target);
            } else {
                return Searching(arr, si, mid - 1, target);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 9;
        int si=0;
        int ei = arr.length-1;
        // int ans = Search(arr, target);
        int ans = Searching(arr,si,ei,target);
        System.out.println("Number is = " + ans + " index");
    }
}
