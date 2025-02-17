package minCostSpanningTree;
import java.util.*;

class Solution {
    static class Pair implements Comparable<Pair> {
        int weight, node;

        Pair(int weight, int node) {
            this.weight = weight;
            this.node = node;
        }

        public int compareTo(Pair other) {
            return this.weight - other.weight; // Min-Heap comparison
        }
    }

    // Function to find the sum of weights of edges in the Minimum Spanning Tree.
    public int spanningTree(int V, List<List<int[]>> adj) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0)); // {weight, node}

        boolean[] inMST = new boolean[V];
        int sum = 0;

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            int wt = p.weight;
            int node = p.node;

            if (inMST[node])
                continue;

            inMST[node] = true; // Added to MST
            sum += wt;

            for (int[] neighbor : adj.get(node)) {
                int nextNode = neighbor[0];
                int edgeWeight = neighbor[1];

                if (!inMST[nextNode]) {
                    pq.add(new Pair(edgeWeight, nextNode));
                }
            }
        }

        return sum;
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
        adj.get(3).add(new int[]{0, 6});
        adj.get(3).add(new int[]{1, 8});
        adj.get(4).add(new int[]{1, 5});
        adj.get(4).add(new int[]{2, 7});

        Solution obj = new Solution();
        System.out.println("MST Weight Sum: " + obj.spanningTree(V, adj));
    }
}

