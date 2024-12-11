
package TREE;
import java.util.*;




public class miniST {
    private int V; // Number of vertices
    private List<List<Edge>> adjList;

    public miniST(int V) {
        this.V = V;
        adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest, int weight) {
        Edge edge1 = new Edge(src, dest, weight);
        Edge edge2 = new Edge(dest, src, weight);
        adjList.get(src).add(edge1);
        adjList.get(dest).add(edge2);
    }

    public void primMST() {
        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        int[] key = new int[V];

        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
        }

        PriorityQueue<Node> pq = new PriorityQueue<>(V, new Node());

        key[0] = 0;
        parent[0] = -1;
        pq.add(new Node(0, key[0]));

        while (!pq.isEmpty()) {
            int u = pq.poll().vertex;
            visited[u] = true;

            for (Edge edge : adjList.get(u)) {
                int v = edge.dest;
                int weight = edge.weight;

                if (!visited[v] && weight < key[v]) {
                    pq.remove(new Node(v, key[v]));
                    key[v] = weight;
                    pq.add(new Node(v, key[v]));
                    parent[v] = u;
                }
            }
        }

        System.out.println("Minimum Spanning Tree:");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i);
        }
    }

    class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    class Node implements Comparator<Node> {
        int vertex, weight;

        Node() {}

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compare(Node node1, Node node2) {
            return node1.weight - node2.weight;
        }
    }
}
