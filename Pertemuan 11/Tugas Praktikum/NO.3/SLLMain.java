public class SLLMain{
    public static void main(String[] args){
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.push("Bahasa");
        singLL.push("Android");
        singLL.push("Komputer");
        singLL.push("Basis Data");
        singLL.push("Matematika");
        singLL.push("Algoritma");
        singLL.push("Statistika");
        singLL.push("Multimedia");
        singLL.print();
        System.out.println("Data Paling Atas adalah : " + singLL.peek());
    }
}