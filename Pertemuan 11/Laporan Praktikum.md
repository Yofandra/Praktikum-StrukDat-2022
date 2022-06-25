# Laporan Praktikum Jobsheet 9 LinkedList
### Nama  : Yofandra Arta Priyoga
### NIM   : 2141720121
### Kelas : TI-1G
### Absen : 29

## Jawaban Pertanyaan
<p> <br>

### Output percobaan 2.1
<img src="Output11/1.png">

### Jawaban Subbab 2.1.2
1. Karena pada programnya memanggil print sedangkan saat di cek data belum ada "isEmpty"
2. Agar data yang akan di inputkan sama dengan temp.next setelah itu temp.next di isi dengan ndinput yang baru
3. Untuk mengecek kondisi apakah temp.next.next null kalau iya maka tail temp.next

### Output percobaan 2.2
<img src="Output11/2.png">

### Jawaban Subbab 2.1.2
1. Karena untuk menghentikan proses penghapusan agar hanya jalan 1 kali
2. Untuk mengecek kondisi apakah temp.next.data bernilai sama dengan key kalau iya maka akan di lakukan temp.next sama dengan temp.next.next
3. Jika return -1 berarti data masih kosong jika selain itu maka akan return index data key

### Tugas Praktikum
#### 1.
#### class node
```java
public class Node{
    int data;
    Node next;

    public Node(int nilai, Node berikutnya){
        this.data=nilai;
        this.next=berikutnya;
    }
}
```
#### class SingleLinkedList
```java
public class SingleLinkedList{

    Node head;
    Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null){
                System.out.print(tmp.data+ "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input){
        Node ndInput = new Node (input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input){
        Node ndInput = new Node(input,null);
        Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next==null) tail=ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertBefore(int key, int input){
        int index = indexOf(key);
        insertAt(index, input);
    }

    public void insertAt(int index, int input){
        if(index < 0){
            System.out.println("indeks salah");
        }else if (index == 0){
            addFirst(input);
        }else{
            Node temp = head;
            for(int i=0; i<index-1;i++){
                temp = temp.next;
            }
            temp.next = new Node (input, temp.next);
            if(temp.next.next==null) tail=temp.next;
        }
    }

    public int getData(int index){
        Node tmp = head;
        for(int i=0; i<index; i++){
            tmp=tmp.next;
        }
        return tmp.data;
    }

    public int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }

        if (tmp==null){
            return -1;
        }else{
            return index;
        }
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if(head==tail){
            head=tail=null;
        }else{
            Node temp=head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next=null;
            tail=temp;
        }
    }

    public void remove(int key){
        if (isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else{
            Node temp=head;
            while (temp!=null){
                if((temp.data == key) && (temp==head)){
                    this.removeFirst();
                    break;
                }else if(temp.next.data==key){
                    temp.next=temp.next.next;
                    if(temp.next==null){
                        tail=temp;
                    }
                    break;
                }
                temp=temp.next;
            }
        }
    }

    public void removeAt(int index){
        if(index==0){
            removeFirst();
        }else{
            Node temp = head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next==null){
                tail=temp;
            }
        }
    }
}
```
#### class SLLMain
```java
public class SLLMain{
    public static void main(String[] args){
        SingleLinkedList singLL = new SingleLinkedList();

        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertBefore(890, 800);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();

        System.out.println("Data pada indeks ke-1="+singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke-"+singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}
```
#### Output
<img src="Output11/3.png">

#### 2.
#### class Node
```java
public class Node{
    char data;
    Node next;

    public Node(char nilai, Node berikutnya){
        this.data=nilai;
        this.next=berikutnya;
    }
}
```
#### class SingleLinkedList
```java
public class SingleLinkedList{

    Node head;
    Node tail;

    	    public boolean isEmpty() { 
	        return head == null; 
	    } 
	  
	    public void print() { 
	        if (!isEmpty()) { 
	            Node tmp = head; 
	            System.out.print("Isi Lingked List :\t"); 
	            while (tmp != null) { 
	                System.out.print(tmp.data + "\t"); 
	                tmp = tmp.next; 
	            } 
	            System.out.println(); 
	        } else { 
	            System.out.println("Linked list kosong"); 
	        } 
	    } 
	  
	    public void printHead(){ 
	        Node tmp = head; 
	        System.out.println(tmp.data); 
	    } 
	  
	    public void addFirst(char input) { 
	        Node ndInput = new Node(input, null); 
	        if (isEmpty()) { //jika lingked list kosong 
	            head = ndInput; //head dan tail sama dengan node input 
	            tail = ndInput; 
	        } else { 
	            ndInput.next = head; 
	            head = ndInput; 
	        } 
	    } 
	  
	    public void addLast(char input) { 
	        Node ndInput = new Node(input, null); 
	        if (isEmpty()) { 
	            head = ndInput;  //head dan tail sama dengan node input 
	        } else { 
	            tail.next = ndInput; 
	        } 
	        tail = ndInput; 
	    } 
	  

	    public void insertAfter(int key, char input) { 
	        Node ndInput = new Node(input, null); 
	        Node temp = head; 
	        do { 
	            if (temp.data == key) { 
	                ndInput.next = temp.next; 
	                temp.next = ndInput; 
	                if (ndInput.next == null) tail = ndInput; 
	                break; 
	            } 
	            temp = temp.next; 
	        } while (temp != null); 
	    } 
	  
	    public void insertBefore(int key, int input) { 
	        int index = indexOf(key); 
	        insertAt(index, input); 
	    } 
	  
	  
	    public void insertAt(int index, int input) { 
	        if (index < 0) { 
	            System.out.println("Indeks Salah"); 
	        } else if (index == 0) { 
	            addFirst((char) input); 
	        } else { 
	            Node temp = head; 
	            for (int i = 0; i < index - 1; i++) { 
	                temp = temp.next; 
	            } 
	            temp.next = new Node((char) input, temp.next); 
	            if (temp.next.next == null) tail = temp.next; 
	        } 
	    } 
	  
	    public int getData(int index) { 
	       Node tmp = head; 
	        for (int i = 0; i < index; i++) { 
	            tmp = tmp.next; 
	        } 
	        return tmp.data; 
	    } 
	  
	    public int indexOf(int key) { 
	        Node tmp = head; 

	        int index = 0; 
	        while (tmp != null && tmp.data != key) { 
	            tmp = tmp.next; 
	            index++; 
	        } 
	  
	        if (tmp == null) { 
	            return -1; 
	        } else { 
	            return index; 
	        } 
	    } 
	  
	    public void removeFirst() { 
	        if (isEmpty()) { 
	            System.out.println("Linked List masih Kosong, tidak dapat dihapus!"); 
	        } else if (head == tail) { 
	            head = tail = null; 
	        } else { 
	            head = head.next; 
	        } 
	    } 
	  
	    public void removeLast() { 
	        if (isEmpty()) { 
	            System.out.println("Linked List masih Kosong, tidak dapat dihapus!"); 
	        } else if (head == tail) { 
	            head = tail = null; 
	        } else { 
	            Node temp = head; 
	            while (temp.next != tail) { 
	                temp = temp.next; 
	            } 
	            temp.next = null; 
	            tail = temp; 
	        } 
	    } 
	  
	    public void remove(int key) { 
	        if (isEmpty()) { 
	            System.out.println("Linked List masih Kosong, tidak dapat dihapus!"); 
	        } else { 
	            Node temp = head; 
	            while (temp != null) { 
	                if ((temp.data == key) && (temp == head)) { 
	                    this.removeFirst(); 
	                    break; 
	                } else if (temp.next.data == key) { 
	                    temp.next = temp.next.next; 
	                    if (temp.next == null) { 
	                        tail = temp; 
	                    } 
	                    break; 
	                } 
	                temp = temp.next; 
	            } 
	        } 
	    } 
	  
	    public void removeAt(int index) { 
	        if (index == 0) { 
	            removeFirst(); 
	        } else { 
	            Node temp = head; 
	            for (int i = 0; i < index - 1; i++) { 
	                temp = temp.next; 
	            } 
	            temp.next = temp.next.next; 
	            if (temp.next == null) { 
	                tail = temp; 
	            } 
	        } 
	    } 
	} 
```
#### class SLLMain
```java
public class SLLMain{
    public static void main(String[] args) throws Exception{
        SingleLinkedList singLL = new SingleLinkedList();

        singLL.print();
        singLL.addFirst('a');
        singLL.print();
        singLL.insertAfter('a', 'c');
        singLL.print();
        singLL.insertBefore('c', 'b');
        singLL.print();
        singLL.insertAt(3, 'd');
        singLL.print();
        singLL.addLast('e');
        singLL.print();
        System.out.println("Nilai Head: ");
        singLL.printHead();

    }
}
```
<img src="Output11/4.png">

#### 3.
#### class Node
```java
public class Node{
    String data;
    Node next;

    public Node(String nilai, Node berikutnya){
        this.data=nilai;
        this.next=berikutnya;
    }
}
```
#### class SingleLinkedList
```java
public class SingleLinkedList{

    Node head;

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null){
                System.out.println(tmp.data+ "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }

    public void push(String input){
        Node ndInput = new Node(input, null);
        ndInput.data = input;
        ndInput.next = head;
        head = ndInput;
    }

    public String peek(){
        return head.data;
    }

}    
```
#### class SLLMain
```java
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
```
#### Output
<img src="Output11/5.png">