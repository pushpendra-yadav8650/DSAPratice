package Searching;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;;

public class Searching {
    //This is a linearSearch
    public static void LineraSearch(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("find the value  = "+ i + " index");
            }
        }
    }
//Binary Search
public static int BinarySearch(int arr[], int target, int size){
        int start = 0; 
        int end = size-1;
        //  int mid = (start + end)/2;
        while(start <= end){
           int  mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
}
public static int[] FirstOcuurence(int arr[], int target){
    int si =0; 
    int ei = arr.length-1;
    int ans = -1;
     int endans = -1;
     
    while(si <= ei){
        int mid = si+(ei-si)/2;
        if(arr[mid] == target){
            ans = mid;
            ei = mid-1; 
        }
        else if(arr[mid] > target){
            ei = mid-1;
        }
        else if(arr[mid] < target){
            si = mid+1;
        }
    }
    si = 0;
    ei = arr.length-1;
    while(si<=ei){
        int mid = si+(ei-si)/2;
        if(arr[mid]== target){
           endans = mid;
           si =mid+1; 
        }
        else if(arr[mid] > target){
            ei = mid-1;

        }
        else if(arr[mid] < target){
            si = mid+1;
        }
    }
    int s = endans - ans +1;
    System.out.println("Total Occurence is ="+s );
    return new int[]{ans,endans};

}

public static int LowerBound(int arr[], int target){
    int si =0;
    int ei = arr.length;
    int ans = -1;
    while(si <= ei){
        int mid = si +(ei-si)/2;
        if(arr[mid] >= target){
            ans = mid;
            ei = mid-1;
        }
        
        else{
            si = mid+1;
        }
    }
    return ans;
}
public static int UpperBound(int arr[], int target){
    int si=0; int ei=arr.length;
    int ans =-1;
    while(si<=ei){
        int mid = si +(ei-si)/2;
        if(arr[mid] > target){
            ans = mid;
            ei = mid-1;
        }
        else{
            si = mid+1;
        }
    }
    return ans;
}
public static int SearchInsertPostion(int arr[], int target){
    
}
    public static void main(String[] args) {
        int arr[]={1,2,3,3,5,8,8,10,10,11};
        int target = 10;
        // int ans[] = new int[4];
        // int size = arr.length;
        // System.out.println(size);
        // // LineraSearch(arr, target);
        // int element = BinarySearch(arr, target, size);
        // if( element == -1){
        //     System.out.println("Not found");
        // }else{
        //     System.out.println("Found the number is = "+ element +" index");
        // }

        // List<Integer> al = new ArrayList<>();
        // al.add(1);
        // al.add(2);
        // al.add(3);
        // al.add(4);
        // al.add(10);
        // System.out.println(al);
        // int idx = Collections.binarySearch(al, 4);
        // System.out.println(idx);

        // int idx[] = FirstOcuurence(arr, target);
        // System.out.println(Arrays.toString(idx));
        int ans = LowerBound(arr, target);
        System.out.println("Lower bound index is = "+ans);
        int ans2 = UpperBound(arr, target);
        System.out.println("Upper bound index is = "+ans2);

    }
    
}
