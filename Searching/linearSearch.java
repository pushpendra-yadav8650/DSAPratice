package Searching;

public class linearSearch {
    public static int lowerbound(int arr[], int x){
        int ans =-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= x){
                ans =i;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,3,7,8,9,9,9,11};
        int x = 9;
        int ans = lowerbound(arr,x);
        System.out.println(ans);
    }
}
