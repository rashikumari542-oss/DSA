import java.util.*;

public class BfsTraversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int m = 6;
        ArrayList<Integer>[] adj = new ArrayList[n+1];
        for(int i = 0; i <= n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        int size = adj.length;
        int node = sc.nextInt();
        q.add(node);
        boolean[] visited = new boolean[size+1];
        for(int i = 0; i < size; i++){
            visited[i] = false;
        }
        visited[node] = true;
        while(!q.isEmpty()){
            int current = q.poll();
            System.out.print(current + " ");
            for(int nei : adj[current]){
                if(!visited[nei]){
                    visited[nei] = true;
                    q.add(nei);
                }
            }
            System.out.println();
        }
        sc.close();
        

    }

}