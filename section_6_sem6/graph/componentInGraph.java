package graph;
import java.util.*;

public class componentInGraph {
    // Function to count connected components in an undirected graph
    public static int countConnectedComponents(int n, List<List<Integer>> adj) {
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited);
                count++;
            }
        }
        return count;
    }

    private static void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }

    // Example usage
    public static void main(String[] args) {
        int n = 5; // Number of nodes (0 to 4)
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        // Example edges
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(2).add(3);
        adj.get(3).add(2);
        // Node 4 is isolated

        int components = countConnectedComponents(n, adj);
        System.out.println("Number of connected components: " + components);
    }
}