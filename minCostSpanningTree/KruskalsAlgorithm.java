package minCostSpanningTree;
import java.util.*;

class Solution {
    // DSU (Disjoint Set Union) Code
    private int[] parent, rank;

    private int find(int x) {
        if (x == parent[x])
            return x;
        return parent[x] = find(parent[x]); // Path compression
    }

    private void union(int x, int y) {
        int xParent = find(x);
        int yParent = find(y);

        if (xParent == yParent)
            return;

        if (rank[xParent] > rank[yParent]) {
            parent[yParent] = xParent;
        } else if (rank[xParent] < rank[yParent]) {
            parent[xParent] = yParent;
        } else {
            parent[xParent] = yParent;
            rank[yParent]++;
        }
    }

    private int kruskal(List<int[]> edges) {
        int sum = 0;
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], wt = edge[2];
            int parentU = find(u), parentV = find(v);

            if (parentU != parentV) {
                union(u, v);
                sum += wt;
            }
        }
        return sum;
    }

    // Function to find sum of weights of edges of the Minimum Spanning Tree
    public int spanningTree(int V, List<List<int[]>> adj) {
        parent = new int[V];
        rank = new int[V];

        for (int i = 0; i < V; i++) 
            parent[i] = i;

        List<int[]> edges = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            for (int[] temp : adj.get(i)) {
                int u = i, v = temp[0], d = temp[1];
                edges.add(new int[]{u, v, d});
            }
        }

        edges.sort(Comparator.comparingInt(a -> a[2])); // Sorting edges by weight

        return kruskal(edges);
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<int[]>> adj = new ArrayList<>();
        
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new int[]{1, 2});
        adj.get(0).add(new int[]{3, 6});
        adj.get(1).add(new int[]{0, 2});
        adj.get(1).add(new int[]{2, 3});
        adj.get(1).add(new int[]{3, 8});
        adj.get(1).add(new int[]{4, 5});
        adj.get(2).add(new int[]{1, 3});
        adj.get(2).add(new int[]{4, 7});

        Solution obj = new Solution();
        int ans = obj.spanningTree(V, adj);
        System.out.println(ans);
    }
}
