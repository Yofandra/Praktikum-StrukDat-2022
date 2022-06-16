import java.util.Scanner;

public class Graph { 
    //menambahkan atribut 
    int vertex; 
    boolean pilih; 
    LinkedList[] list; 
  
    //menambahkan konstruktor default untuk inisialisasi variabel vertex 
    public Graph(int vertex, boolean pilih) { 
        this.vertex = vertex; 
        this.pilih = pilih; 
        list = new LinkedList[vertex]; 
        //menambahkan perulangan untuk jumlah vertex 
        for (int i = 0; i < vertex; i++) { 
            list[i] = new LinkedList(); 
        } 
    } 
  
    //method addEdge() 
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
  
    //method degree() untuk menampilkan jumlah derajat lintasan pada suatu vertex 
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
  
    //method removeEdge() untuk menghapus lintasan suatu graph 
    public void removeEdge(int source, int destination) throws Exception{ 
        for (int i = 0; i < list[source].size(); i++) { 
            if (destination==list[source].get(i)){ 
                list[source].remove(i); 
            } 
        } 
    } 
  
    //method removeAllEdges() untuk menghapus semua vertex yang ada di dalam graph 
    public void removeAllEdges() { 
        for (int i = 0; i < vertex; i++) { 
            list[i].clear(); 
        } 
        System.out.println("Graph berhasil dikosongkan"); 
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
  
    boolean graphtype(boolean pilih) { 
        return pilih; 
    } 

        public static void main(String[] args) throws Exception { 
            int x,y,pilih; boolean info; 
            Scanner sc = new Scanner(System.in); 
            System.out.print("Berapa Banyak Edge : "); 
            int edge = sc.nextInt(); 
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
            Graph graph = new Graph(edge, info); 
            System.out.println("Masukkan <source> <destination>"); 
            int i = 0; 
            while (i < edge){ 
                x = sc.nextInt(); 
                y = sc.nextInt(); 
      
                graph.addEdge(x,y); 
                i++; 
            } 
      
            graph.printGraph(); 
            graph.degree(2); 
            graph.removeEdge(1, 2); 
            graph.printGraph(); 
        } 
    
}    
