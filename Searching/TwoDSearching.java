package Searching;

public class TwoDSearching {
    public static int Search(int arr[][],int row, int col, int target){
        int si =0;
        int ei = row * col -1;
        while(si<=ei){
            int mid = si + (ei-si)/2;
            int rowindex = mid/col;
            int colidx = mid % col;
            int element = arr[rowindex][colidx];
            if(element == target){
                return mid;
            }
            if(element > target){
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int row = 3;
        int col =3;
        int target = 21;
        int ans = Search(arr, row, col, target);
        if(ans == -1){
            System.out.println("Index not found");
        }else{
            System.out.println("Index is "+ ans);
        }
    }
}
