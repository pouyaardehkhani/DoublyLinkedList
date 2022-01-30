import java.util.Iterator;
import java.util.ListIterator;

public class SLLIterator<E> implements ListIterator<E> {
    private DoublyLinkedList<E> list;
    private Node<E> current;
    private Node<E> last_called_node=null;
    private int index=0;
    private int size;

    public SLLIterator(DoublyLinkedList<E> list){
        this.list=list;
        this.size=list.size();
        this.current=list.getHead();
    }

    @Override
    public boolean hasNext() {
        return current!=null;
    }

    @Override
    public E next() {
        E data = current.getData();
        this.last_called_node=current;
        current = current.getNext();
        index++;
        return data;
    }

    @Override
    public E previous(){
        E data = current.getData();
        this.last_called_node=current;
        current = current.getPrev();
        index--;
        return data;
    }

    @Override
    public void remove() {
        if (last_called_node==null){
            System.out.println("no next or previous methods are called!!!");
            throw new IllegalStateException();
        }
        if (last_called_node== list.getHead()){
            Node<E> temp=last_called_node.getNext();
            temp.setPrev(null);
            list.setHead(temp);
            list.setSize(list.size()-1);
            last_called_node=null;
            return;
        }
        if (last_called_node== list.getTail()){
            Node<E> temp=last_called_node.getPrev();
            temp.setNext(null);
            list.setTail(temp);
            list.setSize(list.size()-1);
            last_called_node=null;
            return;
        }
        if (last_called_node!= list.getHead() && last_called_node!= list.getTail()){
            Node<E> temp_perv=last_called_node.getPrev();
            Node<E> temp_next=last_called_node.getNext();
            temp_perv.setNext(temp_next);
            temp_next.setPrev(temp_perv);
            list.setSize(list.size()-1);
            return;
        }
    }

    @Override
    public boolean hasPrevious(){
        if(current==null && index==size){
            current= list.getTail();
        }
        if (index==0){
            return false;
        }
        return current!=null;
    }






    @Override
    public int nextIndex() {
        return 0;
    }
    @Override
    public int previousIndex() {
        return 0;
    }
    @Override
    public void set(E e) {

    }
    @Override
    public void add(E e) {

    }


}
