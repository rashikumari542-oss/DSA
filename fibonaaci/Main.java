import java.util.*;

public class Main {
    public static int fib(int n,int a[]) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (a[n] != -1) {
            return a[n];
        }         
        a[n] = fib(n - 1,a) + fib(n - 2,a);
        return a[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];
        Arrays.fill(a, -1);
        System.out.println(fib(n,a));
        sc.close();
    }
    
}
