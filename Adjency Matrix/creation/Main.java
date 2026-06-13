import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = 7;
        int m = 6;

        ArrayList<Integer> arr[] = new ArrayList[n+1];

        for(int i= 0 ;i<=n;i++){
            arr[i]=new ArrayList<Integer>();
        }

        for (int i = 0; i< m ;i++){
            int u,v;
            u = sc.nextInt();
            v = sc.nextInt();

            System.out.println(u);
            System.out.println(v);

            arr[u].add(v);
            arr[v].add(u);

            

            
        }
        sc.close();
      }
}