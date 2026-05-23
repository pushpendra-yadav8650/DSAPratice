package JavaProblesmsBasic;

public class Pattern {
    public static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i=1; i<n; i++){
            for(int j=1;j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern7(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void Pattern8(int n){
          for(int i=n; i>=1;i--){
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern9(int n){
          for(int i=1; i<=n;i++){
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
           for(int i=n; i>=1;i--){
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern10(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=n; i>1; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern11(int n){
        int k =1;
        for(int i=0; i<n; i++){
            for(int j=1; j<=i;j++){
                if(j%2==1){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                // System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
    public static void Pattern12(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            // System.out.println();
            for(int j=1; j<2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Pattern14(int n){
        char ch ='A';
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }

        
    }
     public static void Pattern16(int n){
         for(int  i=0; i<n; i++){
            char ch ='A';
            for(int j=0; j<i; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }

    }
      public static void Pattern17(int n){
         for(int  i=n; i>1; i--){
            char ch ='A';
            for(int j=0; j<i; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }

    }
      public static void Pattern18(int n){
          char ch ='A';
         for(int  i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }

    }
    public static void Pattern19(int n){
        for(int i=0; i<n; i++){
            char ch ='A';
            for(int j=0; j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print(ch);
                ch++;
            }
            for(int j=0; j<=i; j++){
                System.out.print(ch);
                ch--;
            }
            System.out.println();

        }
    }

     public static void Pattern20(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            for(int j=0; j< 2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=n; i>1; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern21(int n,int m){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=m;j++){
                if(i==1 || i==n || j==1||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void Pattern22(int n,int m){
        for(int i=1; i<n; i++){
            for(int j=1; j<=m; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // pattern2(5);
        // pattern5(5);
        // Pattern7(6);
        // Pattern8(6);
        // Pattern9(6);
        // Pattern10(6);
        // Pattern11(6);
        // Pattern12(6);
        // Pattern14(6);
        // Pattern16(6);
        // Pattern17(6);
        // Pattern18(6);
        // Pattern19(6);
        // Pattern20(6);
        // Pattern21(4,5);
        Pattern22(5,5);

    }
}
