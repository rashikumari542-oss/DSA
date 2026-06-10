import java.util.*;

public class Main{
    static void p(int n){
        if (n==0){
            return;
        }
        p(n-1);
        System.out.println(n);
    }

        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();
            p(n);
            sc.close();

        }
    }
