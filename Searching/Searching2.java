package Searching;

//Searching element in nearlySorted array
public class Searching2 {
//     public static long NearlySearching(long arr[], long target){
//         long si = 0; 
//         long ei = arr.length-1;
//         while(si<=ei){
//             long mid = si + (ei-si)/2;
//             if(arr[mid] == target){
//                 return mid;
//             }
//             if(arr[mid] >= 0 && arr[mid-1] == target){
//                 return mid-1;
//             }
//             if(arr[mid] < arr.length && arr[mid+1] == target){
//                 return mid+1;
//             }
//             if(arr[mid] > target){
//                 ei = mid-2;
//             }else{
//                 si = mid+2;
//             }

//             //  mid = si + (ei-si)/2;
//         }
//         return -1;
//     }
    //Divide 2 number using binary search
    public static int Solve(long dividend, long divisor){
        long si=0; long ei = Math.abs((long)dividend);
        long ans  =0;
        while (si<=ei) {
            long mid = si + (ei - si)/2;
            if(Math.abs(mid * divisor) == Math.abs( dividend)){
                ans = mid;
                break;
            }
            if(Math.abs(mid * divisor) > Math.abs(dividend)){
                ei = mid-1;
            }else{
                ans = mid;
                //Right search
                si=mid+1;
            }
        }
        if( (divisor < 0 && dividend < 0) || (divisor > 0 && dividend >0)){
            return (int)ans;
        }else{
            ans = -ans;
            return (int)ans;
        }
    }
//Find the oddOccuring element in array
    public static int OddOccuring(int arr[]){
        int s = 0;
        int e = arr.length;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(s==e){
                return mid;
            }
            if(mid%2==0){
                if(arr[mid] == arr[mid+1]){
                    s = mid+2;
                }else{
                    e = mid;
                }
            }else{
                if(arr[mid] == arr[mid-1]){
                    s = mid+1;
                }else{
                    e = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // long arr[]={10,3,40,20,50,80,70};
        // long target = 40;
        // long ans = NearlySearching(arr,target);
        // System.out.prlongln("Index is = "+ ans);
        // long dividend = 22;
        // long divisior = -11;
        // long ans = Solve(dividend, divisior);
        // System.out.print(ans);
        int arr[] ={3,3,7,7,10,11,11};
        int ans = OddOccuring(arr);
        System.out.println("Index is = "+ans);
        System.out.println("Element is = "+arr[ans]);
        

    }
}
