public class Stack {
    
    int size;
    int top;
    Struk data[];

    public Stack(int size){
        this.size = size;
        data = new Struk[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if (top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(Struk str){
        if (!IsFull()){
            top++;
            data[top] = str;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop(){
        if(!IsEmpty()){
            Struk x = data[top];
            top--;
            System.out.println("Data yang keluar: " +x.nomor+ " " +x.tanggal+ " " +x.jumlah+ " " +x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }

    public void peek(){
        System.out.println("Elemen teratas: " +data[top].nomor+ " " +data[top].tanggal+ " " +data[top].jumlah+ " " +data[top].harga);
    }

    public void print(){
        System.out.println("Isi stack: ");
        for (int i = top; i>=0; i--){
            System.out.println(data[i].nomor+ " " +data[i].tanggal+ " " +data[i].jumlah+ " " +data[i].harga);
        }
    }

    public void clear(){
        if (!IsEmpty()){
            for (int i=top; i>=0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
    }

    public void getMin(){
        double minHarga = data[0].harga;
        int idx = 0;
        for(int i=0; i<=top; i++){
            if(minHarga > data[i].harga){
                minHarga = data[i].harga;
                idx = i;
            }
        }
        System.out.println("Total harga Struk paling murah adalah " +data[idx].nomor+ " " +data[idx].tanggal+ " " +data[idx].jumlah+ " "
        +data[idx].harga);
    }

}
