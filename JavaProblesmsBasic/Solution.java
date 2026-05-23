package JavaProblesmsBasic;
//Learn basic of java problems
public class Solution {
    public static int forloopadd(int low , int high){
        int sum =0;
        for(int i=low; i<=high; i++){
            sum+=i;
        }
        return sum;
    }
    public static int firt50add(int d){
        int sum = 0;
        int count =0;
       for(int i=d ; count<50; i =i+10){
            System.out.println(i);
            sum +=i;
            // i=i+10;
            System.out.println(count++);
       }
        return sum;
    }
    public static int[] reverse(int arr[]){
        int n = arr.length;
       int start = 0;
       int end = n-1;
       while(start < end){
        // int temp = arr[start];
        // arr[start ] = arr[end];
        // arr[end] = temp;
        arr[start] = arr[start] ^ arr[end];
        arr[end] = arr[start] ^ arr[end];
        arr[start] = arr[start] ^ arr[end];
        start++;
        end--;
       }
       return arr;
    }
    public static void main(String[] args) {
        // System.out.println(forloopadd(1, 5));
        int arr[]={1,2,3,4,5};
        reverse(arr);
        // System.out.println(firt50add(1));
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
