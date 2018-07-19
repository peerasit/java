
import java.util.Scanner;


public class W12P1_RecursiveMin {

    int min(int[] A, int n) {
        if(n==1){
            return A[n];
        }
          int min = min(A,n-1);
          if(min > A[n]){
              return A[n];
          }else{
              return min;
          }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N + 1];
        for (int i = 1; i <= N; ++i) {
            A[i] = scan.nextInt();
        }
        W12P1_RecursiveMin m = new W12P1_RecursiveMin();
        System.out.print(m.min(A, N));
    }
}
