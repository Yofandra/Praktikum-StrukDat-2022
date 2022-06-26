public class Film {
    NodeFilm head;
    int size;

    public Film() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int idFilm, String judul, double rate) {
        if (isEmpty()) {
            head = new NodeFilm(null, idFilm, judul, rate, null);
        } else {
            NodeFilm newNode = new NodeFilm(null, idFilm, judul, rate,
            head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int idFilm, String Judul, double rate) {
        if (isEmpty()) {
            addFirst(idFilm, Judul, rate);
        } else {
            NodeFilm current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeFilm newNode = new NodeFilm(current, idFilm, Judul,
            rate, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int idFilm, String judul, double rate, int index)throws Exception {
        if (isEmpty()) {
            add(idFilm, judul, rate, index);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index terlalu banyak");
        } else {
            NodeFilm current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
            i++;
            }
            if (current.prev == null) {
                NodeFilm newNode = new NodeFilm(null, idFilm, judul,rate, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeFilm newNode = new NodeFilm(current.prev, idFilm,judul, rate, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data film masih kosong");
        } else if (size == 1) {
            removeLast();
        } else {
            NodeFilm tmp = head;
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("Data film dihapus");
            System.out.println("Id Film :" + tmp.idFilm);
            System.out.println("Judul Film : " + tmp.Judul);
            System.out.println("rate Film : " + tmp.rate);
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data film masih kosong");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeFilm current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
        System.out.println("Data film berhasil dihapus");
        System.out.println("Id Film :" + current.idFilm);
        System.out.println("Judul Film : " + current.Judul);
        System.out.println("rate Film : " + current.rate);
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index terlalu banyak");
        } else if (index == 0) {
            removeFirst();
        } else {
            NodeFilm current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
            System.out.println("Data film berhasil dihapus");
            System.out.println("Id Film :" + current.idFilm);
            System.out.println("Judul Film : " + current.Judul);
            System.out.println("rate Film : " + current.rate);
        }
    }

    public void print() {
        if (!isEmpty()) {
            NodeFilm tmp = head;
            while (tmp != null) {
                System.out.println("Id Film :" + tmp.idFilm);
                System.out.println("Judul Film : " + tmp.Judul);
                System.out.println("rate Film : " + tmp.rate);
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Data Kosong");
        }
    }

    public void cari(int idfilm) throws Exception {
        NodeFilm tmp = head;
        while (tmp != null) {
            if (idfilm == tmp.idFilm) {
                System.out.println("Id Film :" + tmp.idFilm);
                System.out.println("Judul Film : " + tmp.Judul);
                System.out.println("rate Film : " + tmp.rate);
            }
            tmp = tmp.next;
        }
    }

    void BubleShort() throws Exception {
        if (isEmpty()) {
            throw new Exception("data film kosong");
        } else {
            NodeFilm current = null, index = null;
            double temp;
            String tmp;
            int templ;
            for (current = head; current.next != null; current =current.next) {
                for (index = current.next; index != null; index =index.next) {
                    if (current.rate < index.rate) {
                        temp = current.rate;
                        tmp = current.Judul;
                        templ = current.idFilm;
                        current.rate = index.rate;
                        current.Judul = index.Judul;
                        current.idFilm = index.idFilm;
                        index.rate = temp;
                        index.Judul = tmp;
                        index.idFilm = templ;
                    }
                }
            }
        }
    }
}
