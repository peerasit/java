import java.util.Scanner;
public class W12P2_RecursiveMin2 {
 static Scanner scan;
 int min(int n) {
     int x = scan.nextInt();
     if(n==1)
         return x;
     int min = min(n-1);
     if(min < x)
         return min;
     else
         return x;
 }

 public static void main(String[] args) {
 scan = new Scanner(System.in);
 int N = scan.nextInt();
 W12P2_RecursiveMin2 minFinder = new W12P2_RecursiveMin2();
 System.out.print(minFinder.min(N));
 }
}