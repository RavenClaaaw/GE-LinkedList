public class LinkedList<T>{
    private Node<T> head;

    LinkedList(){
        this.head = new Node<>(null);
    }

    public void add(T value){
        Node<T> node = new Node<>(value);

        Node<T> current = head;
        while(current.next != null) current = current.next;
        current.next = node;
    }

    public void display(){
        Node<T> current = head.next;
        while(current != null){
            System.out.print(current.value + " "); 
            current = current.next; 
        }
    }
}
