import java.util.Scanner;

public class Graph {
    int vertex;
    DoubleLinkedLists list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new DoubleLinkedLists[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedLists();
        }
    }

    public void addEdge(int source, int destination) {
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception {
        System.out.println("degree vertex " + source + " : " + list[source].size());

        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source)
                    ++totalIn;
            }
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree dari vertex " + source + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        int vertextotal,x,y; 
        System.out.print("Masukkan berapa banyak vertex : "); 
        vertextotal = sc.nextInt(); 
        Graph graph = new Graph(vertextotal); 
        System.out.println("Masukkan <source> <destination>"); 
        int i = 0; 
        while (i <= vertextotal){ 
             x = sc.nextInt(); 
            y = sc.nextInt(); 
  
            graph.addEdge(x,y); 
            i++; 
        } 
        x = sc.nextInt(); 
        y = sc.nextInt(); 
        graph.addEdge(x,y); 
  
        graph.printGraph(); 
        graph.degree(2); 
        graph.removeEdge(1,2); 
        graph.printGraph(); 
    }
}
