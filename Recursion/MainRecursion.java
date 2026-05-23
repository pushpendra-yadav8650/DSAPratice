package Recursion;

import java.util.*;

public class MainRecursion {
    public static void PrintName(String name ,int n ){
        //Base case for stop the function call 
        if(n==0){
            return;
        }
        //Processing 
        System.out.println(name);
        //Recursive realtion 
        PrintName(name, n-1);

    }
    public static int fib(int n){
        //base case
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int ans = fib(n-1) + fib(n-2);
        return ans;
    }
    public static void PrintCounting(int n){
        
        if (n==0){
            return;
        }
        // System.out.println(n);
        PrintCounting(n-1);
       
        System.out.println(n);
        
        
    }
    public static int fact(int n){
        if(n==1) return 1;
        return n * fact(n-1);

    }
    public static int fib1(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        return fib1(n-1)+fib1(n-2);
    }
    public static int Sumall(int n){

        int sum =0;
        if(n==0) return 0;
        sum += n + Sumall(n-1);
        // System.out.println(sum);
        return sum;
    }
    public static void PrintArray(int arr[], int n, int i){
        //base case 
        if(i >= n){
            return;
        }
        System.out.print(arr[i]+" ");
        PrintArray(arr, n, i+1);
    }
    public static int findMax(int arr[],int n, int i, int maxi){
        if(i>=n){
           return  maxi;
        }
        if(arr[i] > maxi){
            maxi = arr[i];
        }
        return findMax(arr, n, i+1, maxi);
    }
    public static int findmin(int arr[], int n, int i, int mini){
        if(i>=n){
            return mini;
        }
        if(mini > arr[i]){
            mini = arr[i];
        }
        return findmin(arr, n, i+1,mini);
    }
    // public static int CheckKey(String str, int n, int i, char key){

    //     if(i>=n) return -1;
    //     if(str.charAt(i) ==  key) return i;
    //     return CheckKey(str, n, i+1, key);
        
    // }
     public static void CheckKey(String str, int n, int i, char key, List<Integer>ans,int count){

        if(i>=n) return ;
        if(str.charAt(i) ==  key) {
             System.out.println("Found at "+i);
             ans.add(i);
             count++;
        }
        CheckKey(str, n, i+1, key,ans,count);
        
    }
    public static void DigitPrint(int n){
        if(n==0) return;

        int digit  = n%10;
        System.out.print(digit+" ");
        DigitPrint(n/10);
    }
    public static void main(String[] args) {
        // int n=3;
        // String name="Mohan";
        // PrintName(name, n);
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the term you want see: ");
    //     int n = sc.nextInt();
    //     int ans = fib(n);
    //    System.out.println(n+"th term is :"+ ans);
    
    // PrintCounting(10);
    // int ans = fact(5);
    // System.out.println(ans);
    // System.out.println(fib(7));
    // System.out.println("sum of given counting = "+Sumall(4));
    // int arr[] ={10,20,30,40,50};
    // int n =5;
    // int i=0;
    // // int maxi = Integer.MIN_VALUE;
    // int mini =Integer.MAX_VALUE;
    // // maxi = findMax(arr, n, i, maxi);
    // mini = findmin(arr, n,i, mini);
    // System.out.println(mini);
    // String str="Pushpepndoprayadav";
    // int n = str.length();
    // char key = 'p';
    // int i=0;
    // int count =0;
    // List<Integer> ans = new ArrayList<>();
    // CheckKey(str, n, i, key,ans,count);
    // for(int val:ans){
    //     System.out.print(val+" ");
    // }
        DigitPrint(3892);
   
    }
}
