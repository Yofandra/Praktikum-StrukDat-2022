# Laporan Praktikum Jobsheet 13 Pertemuan 14
### Nama  : Yofandra Arta Priyoga
### NIM   : 2141720121
### Kelas : TI-1G
### Absen : 29

## Jawaban Pertanyaan
<p> <br>

### Output percobaan 13.1
<img src="Output/1.png">

### Jawaban Subbab 13.1
1. Karena pada Binary Search Tree terdapat aturan bahwa setiap child node sebelah kiri selalu lebih kecil nilainya dari pada root node. Begitu pula sebaliknya, setiap child node sebelah kanan selalu lebih besar nilainya daripada root node, yang dapat memberikan proses efisiensi pada proses searching.
2. Kegunaannya seperti prev dan next
3. a. Untuk menentukan nilai paling atas
   b. Null atau kosong
4. Proses penginputan node ke dalam root
5. jika data baru kurang dari data lama maka di lakukan pengecekan lagi apakah data kiri bernilai sama dengan null, jika iya data lama akan maka akan masuk ke dalam data kiri, jika tidak maka data kiri di ganti dengan data yang baru saja di masukkan, setelah itu break

### Output percobaan 13.2
<img src="Output/2.png">

### Jawaban Subbab 13.2
1. Data untuk mendeklarasikan banyaknya nilai array dan IdxLast untuk menentukan alamat agar tidak eror waktu add
2. Untuk menginput data agar dikenali indexnya
3. Untuk mengeprint secara inOrder atau mengeprint seluruh data pada tree secara rekursif mulai dari sebelah kiri
4. Left = 1 dan right 3
5. Untuk melimit index agar hanya menjadi 6

### Tugas Praktikum 13.3
1. 
```java
void addrekursif(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }
```

2. 
```java
int Min(Node node) {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    int Max(Node node) {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }
```

3 & 4
```java
public void printLeaves(Node node) {
        if (node == null) {
            return;
        }
        if (node.isLeaf()) {
            System.out.print(" " + node.data);
            total++;
        }
        printLeaves(node.left);
        printLeaves(node.right);
    }
```

Output no. 1-4
<img src="Output/3.png">

5. 
Class BinaryTreeArray
```java
public class BinaryTreeArray {
    int[] data;
    int idxLast;

    public BinaryTreeArray() {
        data = new int[10];
    }

    void add(int key) {
        idxLast++;
        data[idxLast] = key;
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
```
Class BinaryTreeArrayMain
```java
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.add(7);
        bta.add(6);
        bta.add(5);
        bta.traverseInOrder(0);
        System.out.println(" ");
        bta.traversePreOrder(0);
        System.out.println(" ");
        bta.traversePostOrder(0);
        System.out.println(" ");
    }
}
```
Output no. 5
<img src="Output/4.png">


