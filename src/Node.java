public class Node<E> {

    private E data;
    private Node<E> next;
    private Node<E> prev;

    public Node(){
        this(null,null,null);
    }

    public Node(E o, Node<E> o1, Node<E> o2) {
        data=o;
        next=o1;
        prev=o2;
    }

    public Node(E o){
        data=o;
        next=null;
        prev=null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }
}
