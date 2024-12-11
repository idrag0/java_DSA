package ADA;
import java.util.*;




public class Kruskal {
    // Define the edge class to represent edges in the graph
    private static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
    }

    // Define the method to find the minimum spanning tree using Kruskal's algorithm
    public static void findMinimumSpanningTree(int[][] graph) {
        int V = graph.length;
        List<Edge> edges = new ArrayList<>();

        // Populate the list of edges from the graph
        for (int i = 0; i < V; i++) {
            for (int j = i + 1; j < V; j++) {
                if (graph[i][j] != 0) {
                    edges.add(new Edge(i, j, graph[i][j]));
                }
            }
        }

        // Sort the edges in ascending order of their weights
        Collections.sort(edges);

        // Create a parent array to track the parent of each vertex
        int[] parent = new int[V];
        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }

        // Create a list to store the edges in the minimum spanning tree
        List<Edge> minimumSpanningTree = new ArrayList<>();

        // Iterate over the sorted edges and add them to the minimum spanning tree if they do not create a cycle
        for (Edge edge : edges) {
            int srcParent = findParent(parent, edge.src);
            int destParent = findParent(parent, edge.dest);

            if (srcParent != destParent) {
                minimumSpanningTree.add(edge);
                parent[srcParent] = destParent;
            }
        }

        // Print the minimum spanning tree
        System.out.println("Minimum Spanning Tree:");
        for (Edge edge : minimumSpanningTree) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
        }
    }

    // Helper method to find the parent of a vertex using the parent array
    private static int findParent(int[] parent, int vertex) {
        if (parent[vertex] != vertex) {
            parent[vertex] = findParent(parent, parent[vertex]);
        }
        return parent[vertex];
    }

    public static void main(String[] args) {
        // Example usage
        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        findMinimumSpanningTree(graph);
    }
}
