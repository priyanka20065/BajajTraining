import java.util.ArrayList;
import java.util.List;

public class GraphDFSTraversal {
    public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        boolean[] vis = new boolean[V];
        List<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls);
        return ls;
    }
    
    private void dfs(int node, boolean[] vis, List<List<Integer>> adj, List<Integer> ls) {
        vis[node] = true;
        ls.add(node);
        
        for (Integer it : adj.get(node)) {
            if (!vis[it]) {
                dfs(it, vis, adj, ls);
            }
        }
    }
}
