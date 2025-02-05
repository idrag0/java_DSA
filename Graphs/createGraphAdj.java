
// graph using List of ArrayList
package Graphs;
import java.util.*;
public class createGraphAdj {
    static class Edge{
        int src;
        int dest;
        int wt;
        
        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void printNeibors(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            System.out.print(i+" -> ");
            for(Edge e : graph[i]){
                System.out.print("("+e.dest+","+e.wt+") ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
         /*
                         (5)
                    0----------1
                              / \
                          (1)/   \(3)
                            /     \
                            2-------3
                            |  (1)
                         (2)|
                            |
                            4
         */

         int V = 5;
         ArrayList<Edge>[] graph = new ArrayList[V]; // null

         for(int i=0;i<V;i++){ // making arraylist empty
             graph[i] = new ArrayList<>();
         }
         
         graph[0].add(new Edge(0,1,5)); // 0-vertex

         graph[1].add(new Edge(1,0,5)); // 1-vertex
         graph[1].add(new Edge(1,2,1)); 
         graph[1].add(new Edge(1,3,3));

         graph[2].add(new Edge(2,1,1)); // 2-vertex
         graph[2].add(new Edge(2,3,1));
         graph[2].add(new Edge(2,4,2));

         graph[3].add(new Edge(3,1,3)); // 3-vertex
         graph[3].add(new Edge(3,2,1));

         graph[4].add(new Edge(4,2,2)); // 4-vertex

         printNeibors(graph);
    }
}
