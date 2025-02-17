package Graphs;
import java.util.ArrayList;
public class detctCycleGraph {
    public static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.dest = d;
            this.src = s;
        }
    }

    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 0));
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));

    }

    public static boolean detectCycle(ArrayList<Edge>graph[]){
        boolean visited[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                if(detectCycleUntil(graph, i, visited, -1)){    // -1 is parent of source node  
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUntil(ArrayList<Edge>graph[], int src, boolean visited[], int parent){
        visited[src] = true;

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!visited[e.dest]){
                if(detectCycleUntil(graph, e.dest, visited, src)){
                    return true;
                }
            }else if(visited[e.dest] && e.dest != parent){
                return true;
            }
        }
        return false;
    }
     
    public static void main(String[] args) {
    /*
        1 -- 0 -- 3 -- 4
         \    |
           \  |
             2
    */

    int v = 5;
    ArrayList<Edge> graph[] = new ArrayList[v];

    createGraph(graph);

    System.out.println(detectCycle(graph));
    }
}
