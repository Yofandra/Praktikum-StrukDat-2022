public class Queue {
    
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n){
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if(size==0){
            return  true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }

    public void Enqueue(Mahasiswa antri){
        if(IsFull()){
            System.out.println("Antrian sudah penuh");
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
                if(rear == max-1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = antri;
            size++;
        }
    }

    public Mahasiswa Dequeue(){
        Mahasiswa antri = new Mahasiswa();
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            antri = data[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else{
                if(front == max-1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return antri;
    }

    public void Print(){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            int i = front;
            while(i != rear){
                System.out.println(data[i].nim + " " + data[i].nama + " " + data[i].absen 
                + " " + data[i].ipk);
                i = (i+1)%max;
            }
            System.out.println(data[i].nim + " " + data[i].nama + " " + data[i].absen 
            + " " + data[i].ipk);
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void Peek(){
        if(!IsEmpty()){
            System.out.println("Antrian terdepan: " +data[front].nim + " " + data[front].nama + " " + data[front].absen 
            + " " + data[front].ipk);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }

    public void PeekRear(){
        if(!IsEmpty()){
            System.out.println("Antrian paling belakang: " +data[rear].nim + " " + data[rear].nama + " " + data[rear].absen 
            + " " + data[rear].ipk);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }

    public void PeekPosition(String nimCari){
        int i = front;
        int posisi = 1;
        System.out.print("Data mahasiswa di posisi: ");
        while(i != rear){
            if (data[i].nim.equals(nimCari)){
                System.out.print(posisi + " ");
            }
            i = (i+1)%max;
            posisi++;    
        }
        if(data[i].nim.equals(nimCari)){
            System.out.print(posisi + " ");
        }
        System.out.println();
    }

    public void PrintMahasiswa(int position){
        int idxCari = front;
        System.out.print("Data mahasiswa pada posisi " +position+ " adalah: ");
        for (int i=0; i<position-1; i++){
            idxCari=(idxCari+1)%max;
        }
        System.out.println(data[idxCari].nim + " " + data[idxCari].nama + " " + data[idxCari].absen 
            + " " + data[idxCari].ipk);
    }
}
