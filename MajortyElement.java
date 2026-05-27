package Leetcode;

import java.util.Arrays;;

//Leetcode number is -> 169
public class MajortyElement {
    // This is a brute force
    public static void Majorty(int arr[]) {
        int n = arr.length;
        System.out.println(n);
        for (int val : arr) {
            int count = 0;
            for (int ele : arr) {
                if (ele == val) {
                    count++;
                }
            }
            if (count > n / 2) {
                System.out.println("Match");
                return;
            }
        }
        System.out.println("Not Match");
    }

    // This is a optimize solution of majorty element
    // in this first sort the arry than apply this approach
    public static void MajortyOptimize(int arr[]) {
        Arrays.sort(arr);
        int count = 1;
        int ans = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
                ans = arr[i];
            }

            if (count > (Math.floor(arr.length / 2))) {
                System.out.println("Major element is " + ans);
                return;
            }
        }
        System.out.println("Not match");
    }
    // return ans;

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 1, 1, 1, 1, 1 };
        // Majorty(arr);
        // System.out.println(MajortyOptimize(arr));
        MajortyOptimize(arr);

    }
}
