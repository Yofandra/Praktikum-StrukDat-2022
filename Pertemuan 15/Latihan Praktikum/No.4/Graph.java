public class Graph { 
    //menambahkan atribut 
    int vertex; 
    LinkedList[] list; 
  
    //menambahkan konstruktor default untuk inisialisasi variabel vertex 
    public Graph(int vertex) { 
        this.vertex = vertex; 
        list = new LinkedList[vertex]; 
        //menambahkan perulangan untuk jumlah vertex 
        for (int i = 0; i < vertex; i++) { 
            list[i] = new LinkedList(); 
        } 
    } 
  
    //method addEdge() 
    public void addEdge(int index, int index2, String source, String destination) { 
        //add edge 
        list[index].addFirst(destination); 
  
        //add back adge (for undirected) 
        list[index2].addFirst(source); 
    } 
  
    //method degree() untuk menampilkan jumlah derajat lintasan pada suatu vertex 
    public void degree(int source) throws Exception { 
        //degree undirected graph 
        System.out.println("degree vertex " + source + " : " + list[source].size()); 
  
        //degree directed graph 
        //inDegree 
        int k, totalIn = 0, totalOut = 0; 
        for (int i = 0; i < vertex; i++) { 
            for (int j = 0; j < list[i].size(); j++) { 
                list[i].get(j); 
            } 
            //outDegree 
            for (k = 0; k < list[source].size(); k++) { 
                list[source].get(k); 
            } 
            totalOut = k; 
        } 
        System.out.println("Indegree dai vertex " + source + " : " + totalIn); 
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut); 
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut)); 
    } 
  
    //method removeEdge() untuk menghapus lintasan suatu graph 
    public void removeEdge(int source, int destination) throws Exception { 
        for (int i = 0; i < vertex; i++) { 
            if (i == destination) { 
                list[source].remove(destination); 
            } 
        } 
    } 
  
    //method printGraph() untuk mencatak graph ter-update 
    public void printGraph() throws Exception { 
        for (int i = 0; i < vertex; i++) { 
            if (list[i].size() > 0) { 
                System.out.print("Vertex " + i + " terhubung dengan: "); 
                for (int j = 0; j < list[i].size(); j++) { 
                    System.out.print(list[i].get(j) + " "); 
                } 
                System.out.println(); 
            } 
        } 
        System.out.println(" "); 
    } 
 
    public static void main(String[] args) throws Exception { 
        Graph graph = new Graph(6); 
//      0 Surabaya 
//      1 Malang 
//      2 Gresik 
//      3 Blitar 
//      4 Sidoarjo 
        graph.addEdge(0, 1, "Surabaya", "Malang"); 
        graph.addEdge(0, 4, "Surabaya", "Sidoarjo"); 
        graph.addEdge(1, 2, "Malang", "Gresik"); 
        graph.addEdge(1, 3, "Malang", "Blitar"); 
        graph.addEdge(1, 4, "Malang", "Sidoarjo"); 
        graph.addEdge(2, 3, "Gresik", "Blitar"); 
        graph.addEdge(3, 4, "Blitar", "Sidoarjo"); 
        graph.addEdge(3, 0, "Blitar", "Surabaya"); 
        System.out.println(); 
        graph.printGraph(); 
        graph.degree(2); 
        graph.removeEdge(1, 2); 
        graph.printGraph(); 
    }
} 
