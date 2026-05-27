package Leetcode;
import java.util.*;
// 658. Find K Closest Elements
// Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
// An integer a is closer to x than an integer b if:
// |a - x| < |b - x|, or
// |a - x| == |b - x| and a < b

public class FIndKColsestElement {
    public static ArrayList<Integer> findClosestElement(int arr[], int k, int x){
    int l = 0;
    int h = arr.length-1;
    while(h-l >= k){
        if(Math.abs(x - arr[l]) > Math.abs(arr[h]-x)){
            l++;
        }else{
            h--;
        }
    }
    ArrayList<Integer> ans = new  ArrayList<>();
    for(int i=l ; i<=h; i++){
        ans.add(arr[i]);
        // System.out.println(arr[i]);
    }
   
    return ans;
    }

//Using Binarysearch
public static int lowerbound(int arr[], int x){
    int si = 0;
    int ei = arr.length-1;
    int ans = -1;
    while(si<=ei){
        int mid = si +(ei - si)/2;
        if(arr[mid] >= x){
            ans  = mid;
            // System.out.println("store the answer"+arr[ans]);
            ei = mid-1;
        }
        else if(x > arr[mid]){
            si = mid+1;
        }
        else{
            ei = mid-1;
        }
    }
    // System.out.println("Lower bound answer"+ans);
    return ans;
}
public static ArrayList<Integer> findekElement(int arr[],int k, int x){
    int h = lowerbound(arr,x);
    int l = h-1;
    while(k-- > 0){
        if( l< 0){
            h++;
            
        }
        else if(h >=arr.length ){
            l--;
        }
        else if(x-arr[l] > arr[h]-x){
            h++;
        }else{
            l--;
        }
    }
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i=l+1; i<=h-1; i++){
        ans.add(arr[i]);
    }
    // System.out.println(ans);
    return ans ;
}
    public static void main(String[] args) {
        int arr[] = { 12,16,22,30,35,39,42,45,48,50,53,55,56};
        int k = 4;
        int x = 35;
        ArrayList<Integer> ans2 = findClosestElement(arr, k, x);
        ArrayList<Integer> ans = findekElement(arr, k, x);
        System.out.println(ans);
        System.out.println(ans2);
        // for(int i=0; i<ans.size(); i++){
        //     System.out.println(ans.get(i));
        // }
    

    }

}
