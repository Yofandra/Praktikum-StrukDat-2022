import java.util.Scanner;

public class Graph {
    int vertex;
    boolean pilih;
    DoubleLinkedLists list[];

    public Graph(int vertex, boolean pilih) {
        this.vertex = vertex;
        this.pilih = pilih;
        list = new DoubleLinkedLists[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedLists();
        }
    }

    public void addEdge(int source, int destination) { 
        if (graphtype(pilih)) { 
            list[source].addFirst(destination); 
        } else { 
            //add edge 
            list[source].addFirst(destination); 
            //add back adge (for undirected) 
            list[destination].addFirst(source); 
        } 
  
    } 

    public void degree(int source) throws Exception { 
        if (graphtype(pilih)) { 
            //degree directed graph 
            //inDegree 
            int k, totalIn = 0, totalOut = 0; 
            for (int i = 0; i < vertex; i++) { 
                for (int j = 0; j < list[i].size(); j++) { 

                    if (list[i].get(j) == source) { 
                        ++totalIn; 
                    } 
                } 
                //outDegree 
                for (k = 0; k < list[source].size(); k++) { 
                    list[source].get(k); 
                } 
                totalOut = k; 
            } 
            System.out.println("Indegree dari vertex " + source + " : " + totalIn); 
            System.out.println("Outdegree dari vertex " + source + " : " + totalOut); 
            System.out.println("degree vertex " + source + " : " + (totalIn + totalOut)); 
        } else { 
            //degree undirected graph 
            System.out.println("degree vertex " + source + " : " + list[source].size()); 
        } 
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

    boolean graphtype(boolean pilih) { 
        return pilih; 
    } 

        public static void main(String[] args) throws Exception { 
        int pilih; boolean info; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Pilih Jenis Graph"); 
        System.out.println("1. Directed"); 
        System.out.println("2. Undirected"); 
        System.out.print("Pilih = "); 
        pilih = sc.nextInt(); 
        if (pilih == 1) { 
            System.out.println("Anda menggunakan Directed Graph"); 
            info = true; 
        } else { 
            System.out.println("Anda menggunakan UnDirected Graph"); 
            info = false; 
        } 
        Graph graph = new Graph(6, info); 
        graph.addEdge(0, 1); 
        graph.addEdge(0, 4); 
        graph.addEdge(1, 2); 
        graph.addEdge(1, 3); 
        graph.addEdge(1, 4); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 4); 
        graph.addEdge(3, 0); 
        graph.printGraph(); 
        graph.degree(2); 
        graph.removeEdge(1, 2); 
        graph.printGraph(); 
    } 
} 
