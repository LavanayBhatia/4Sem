//public class Main {
//    public static void main(String[] args) {
//     int x=call(5);
//     System.out.print(x);
//    }
//    static int call(int n){
//        if(n==0)return 1;
//        return n*call(n-1);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int x=fibo(5);
//        System.out.print(x);
//    }
//    static int fibo(int n){
//        if(n==1 || n==0)return n;
//        return fibo(n-1)+fibo(n-2);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int x=call(5);
//        System.out.print(x);
//    }
//    static int call(int n){
//        if(n==1)return 1;
//        return n+call(n-1);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int x=call(54321,0);
//        System.out.print(x);
//    }
//    static int call(int n,int rev){
//        if(n==0)return rev;
//        return call(n/10,rev*10+n%10);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int x=call(543211);
//        System.out.print(x);
//    }
//    static int call(int n){
//        if(n==0)return 0;
//        return call(n/10)+1;
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int x=call(2,5);
//        System.out.print(x);
//    }
//    static int call(int n,int base){
//        if(base==0)return 1;
//        return n*call(n,base-1);
//    }
//}

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
//        int arr[][]=new int[n][n];
//        for(int i=0;i<n;i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = in.nextInt();
//            }
//        }
//        int top=0,left=0,right=n-1,bottom=n-1;
//        while(top<=bottom && left<=right){
//            for(int i=left;i<=right;i++){
//                System.out.print(arr[top][i]+" ");
//            }
//            top++;
//            if(top>bottom)break;
//            for(int i=top;i<=bottom;i++){
//                System.out.print(arr[i][right]+" ");
//            }
//            right--;
//            if(left>right)break;
//            for(int i=right;i>=left;i--){
//                System.out.print(arr[bottom][i]+" ");
//            }
//            bottom--;
//            if(top>bottom)break;
//            for(int i=bottom;i>=top;i--){
//                System.out.print(arr[i][left]+" ");
//            }
//            left++;
//        }
//    }
//
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int x=comb(5,3);
//        System.out.print(x);
//    }
//    static int perm(int a,int b){
//        return   fact(a)/fact(a-b);
//
//    }
//    static int comb(int a,int b){
//        return fact(a)/(fact(b)*fact(a-b));
//    }
//    static int fact(int n){
//        if(n==0)return 1;
//        return n*fact(n-1);
//    }
//}
//
