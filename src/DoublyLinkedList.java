import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.ListIterator;

public class DoublyLinkedList<E> {
    private int size;
    private Node<E> head;
    private Node<E> tail;

    public DoublyLinkedList(){
        head=null;
        tail=null;
        size=0;
    }

    public void addFirst(E element){
        Node<E> temp=new Node<E>();
        temp.setData(element);
        temp.setNext(head);
        temp.setPrev(null);
        if (size==0){
            tail=temp;
        }
        else {
            head.setPrev(temp);
        }
        head=temp;
        size++;
    }

    public void addLast(E element){
        Node<E> temp=new Node<E>();
        temp.setData(element);
        temp.setNext(null);
        temp.setPrev(tail);
        if (size==0){
            head=temp;
        }
        else {
            tail.setNext(temp);
        }
        tail=temp;
        size++;
    }

    public void add(int index, E element){
        if (index<0 || index>size){
            throw new IndexOutOfBoundsException();
        }
        Node<E> temp=new Node<E>();
        temp.setData(element);
        if (size==0){
            temp.setPrev(null);
            temp.setNext(null);
            head=temp;
            tail=temp;
            size++;
        }
        int counter=0;
        Node<E> ind=head;
        while (ind.getNext()!=null && counter!=index){
            ind=ind.getNext();
            counter++;
        }
        if (index==0 && size!=0){
            temp.setPrev(null);
            temp.setNext(ind);
            ind.setPrev(temp);
            head=temp;
            size++;
        }
        if (index==size-1 && size!=0 && size!=1){
            Node<E> ind_prev=ind.getPrev();
            ind_prev.setNext(temp);
            temp.setPrev(ind_prev);
            temp.setNext(ind);
            ind.setPrev(temp);
            size++;
        }
        if (index>0 && index<size-2){
            Node<E> ind_prev=ind.getPrev();
            ind_prev.setNext(temp);
            temp.setPrev(ind_prev);
            temp.setNext(ind);
            ind.setPrev(temp);
            size++;
        }
    }

    public E removeFirst(){
        if (head==null){
            System.out.println("The list is empty");
        }
        Node<E> temp=head;
        head=head.getNext();
        head.setPrev(null);
        size--;
        return temp.getData();
    }

    public E removeLast(){
        if (head==null){
            System.out.println("The list is empty");
        }
        Node<E> temp=tail;
        tail=tail.getPrev();
        tail.setNext(null);
        size--;
        return temp.getData();
    }

    public E remove(int index){
        if (index<0 || index>size){
            throw new IndexOutOfBoundsException();
        }
        if (size==0){
            System.out.println("list is empty");
            throw new EmptyStackException();
        }
        int counter=0;
        Node<E> temp=head;
        while (temp.getNext()!=null && counter!=index){
            temp=temp.getNext();
            counter++;
        }
        if (index==0){
            Node<E> next_temp=temp.getNext();
            next_temp.setPrev(null);
            head=next_temp;
            size--;
            return temp.getData();
        }
        if (index==(size-1)){
            Node<E> prev_temp=temp.getPrev();
            prev_temp.setNext(null);
            tail=prev_temp;
            size--;
            return temp.getData();
        }
        Node<E> prev_temp=temp.getPrev();
        Node<E> next_temp=temp.getNext();
        prev_temp.setNext(next_temp);
        next_temp.setPrev(prev_temp);
        size--;
        return temp.getData();
    }

    public boolean addNonRedundant(E element){
        Node<E> temp=new Node<E>();
        temp.setData(element);
        if (size==0){
            temp.setPrev(null);
            temp.setNext(null);
            head=temp;
            tail=temp;
            size++;
            return true;
        }
        Node<E> i=head;
        while (i.getNext()!=null){
            if (!element.equals(i.getData())){
                i=i.getNext();
            }
            else {
                return false;
            }
        }
        temp.setPrev(null);
        temp.setNext(head);
        head.setPrev(temp);
        head=temp;
        size++;
        return true;
    }

    public ListIterator<E> iterator() {
        return new SLLIterator(this);
    }

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        Node<E> temp=head;
        while (temp.getNext()!=null){
            s.append(temp.getData());
            temp=temp.getNext();
        }
        s.append(temp.getData());
        return s.toString();
    }

    public int size() {
        return size;
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }
}
