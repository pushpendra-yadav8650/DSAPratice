package Searching;
import java.util.*;
public class Sqrt {
    public static int sqrtFn(int n){
        int si=0;
        int en = n;
        int ans =-1;
        while(si <= en){
            int mid = si + (en - si)/2;
            if(mid * mid > n){
                en = mid-1;
            }
            if(mid*mid < n){
                ans = mid;
                si = mid+1;
            }
            if(mid*mid == n){
                return mid;
            }
        }
        return ans;
    }

     public static void main(String[] args) {
        int n = 10;
        int ans = sqrtFn(n);
        System.out.println(ans);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of floating digit in precision:");
        int precison = sc.nextInt();
        double step = 0.1;
       
        double finalans = ans;
        for(int i=0; i<precison;i++){
            for(double j=finalans; j*j<=n; j = j+step){
                finalans =j;
            }
            step = step/10;
        }

       System.out.println("final ans = "+ finalans );
     }
}