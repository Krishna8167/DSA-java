import java.util.*;

class DetectCycle {

    static class Edge {
        int src, dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));

        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 2));

        graph[3].add(new Edge(3, 0)); // creates cycle
        graph[0].add(new Edge(0, 3));
    }
    
    public static boolean isCycle(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parent) {
        vis[curr] = true;
        
        for (Edge e : graph[curr]) {
            
            if (!vis[e.dest]) {
                if (isCycle(graph, vis, e.dest, curr)) {
                    return true;
                }
                
            } else if (e.dest != parent) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        
        boolean[] vis = new boolean[V];
        
        for (int i = 0; i < V; i++) {
            
            if (!vis[i]) {
                if(isCycle(graph, vis, i, -1)) {
                    System.out.println("Cycle exists ");
                    return ;
                }
            }
        }
        System.out.println("No Cycle ");
    }
}
