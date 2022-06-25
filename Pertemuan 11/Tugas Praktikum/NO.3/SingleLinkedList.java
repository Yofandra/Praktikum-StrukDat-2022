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