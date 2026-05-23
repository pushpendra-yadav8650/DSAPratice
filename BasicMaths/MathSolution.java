public class MathSolution{

    public static int countDigit(int n){
        int count =0;
        while(n > 0){
            int num = n%10;
            count++;
            n=n/10;
            // System.out.println();
        }
        return count;
    }
    public static int reverDigit(int n){
    
        int rev =0; 
        boolean isNeagtive = n<0;
        if(isNeagtive){
            n=-n;
        }
        while(n != 0){
            
                int temp = n%10;
                rev = rev *10 + temp;
                n= n/10;
            
           
        }
        if(isNeagtive){
            rev = -rev;
        }
        return rev;
    }
    public static boolean Palindrome(int n){
        int tempval =n;
        int rev =0;
        //handle the (-)case of palindrome
        if(n<0){
            return false;
        }
        while(n>0){
            int temp = n%10;
            rev = rev *10+temp;
            n=n/10;
        }
        if(tempval == rev){
            return true;
        }
        return false;
    }
    public static boolean ArmstrongNum(int n){
        int tempnum = n;
        int newnum =n;
        int k =0;
        int sum =0;
        while(n>0){
            int digit = n%10;
            k++;
            n=n/10; 
        }
        while(tempnum > 0){
            int digit = tempnum % 10;
            sum +=Math.pow(digit, k);
            tempnum= tempnum/10;
        }
        if(newnum == sum){
            return true;
        }
        return false;
    }
    public static void PrintAllDivisor(int n){
        int i=1; 
        while(i < n){
            if(n%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
    public static boolean isPrinme(int n){
        int count =0;
        int i=1;
        while(n >= i){
            if(count > 2){
                break;
            }
            if(n%i==0){
                count++;
            }
            i++;
        }
        // System.out.println(count);
        if(count == 2){
            return true;
        }
        return false;
    }
    public static int GCD(int n1, int n2){
        int gcd=1;
        for(int i=1; i<=Math.min(n1,n2); i++){
            if(n1%i==0 && n2%i==0){
                gcd =i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        // int n= -2786;
        // System.out.println(countDigit(n));
        // System.out.println(reverDigit(n));
        // System.out.println(Palindrome(n));
        // System.out.println(ArmstrongNum(153));
        // PrintAllDivisor(36);
        // System.out.println(isPrinme(2));
        System.out.println(GCD(16,18));
    }
}