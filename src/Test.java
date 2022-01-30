import java.util.Iterator;
import java.util.ListIterator;

public class Test {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> temp=new DoublyLinkedList<>();
        System.out.println(temp.size());

        temp.addFirst(1);
        temp.addFirst(2);
        temp.addLast(3);
        System.out.println();
        System.out.println(temp.size());
        System.out.println(temp);
        temp.removeFirst();
        System.out.println();
        System.out.println(temp.size());
        System.out.println(temp);
        temp.removeLast();
        System.out.println();
        System.out.println(temp.size());
        System.out.println(temp);

        temp=new DoublyLinkedList<Integer>();
        temp.addLast(1);
        temp.addLast(2);
        temp.addFirst(3);
        System.out.println();
        System.out.println(temp.size());
        System.out.println(temp);
        System.out.println();
        System.out.println(temp.addNonRedundant(3));
        System.out.println(temp.addNonRedundant(4));
        System.out.println(temp.size());
        System.out.println(temp);


        temp.add(0,5);
        temp.add(4,6);
        temp.add(2,9);
        System.out.println();
        System.out.println(temp.size());
        System.out.println(temp);

        System.out.println();
        System.out.println(temp.remove(0));
        System.out.println(temp.remove(2));
        System.out.println(temp.remove(4));
        System.out.println();
        System.out.println(temp.size());
        System.out.println(temp);

        System.out.println();
        temp=new DoublyLinkedList<Integer>();
        temp.addFirst(3);
        temp.addFirst(2);
        temp.addFirst(1);

        ListIterator<Integer> it= temp.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println();
        it= temp.iterator();
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println("no element");

        System.out.println();
        it= temp.iterator();

        it.next();
        System.out.println(temp);
        it.remove();
        System.out.println(temp);

        System.out.println();
        temp=new DoublyLinkedList<Integer>();
        temp.addFirst(3);
        temp.addFirst(2);
        temp.addFirst(1);
        it= temp.iterator();

        it.next();
        it.next();
        it.next();
        System.out.println(temp);
        it.remove();
        System.out.println(temp);

        System.out.println();
        temp=new DoublyLinkedList<Integer>();
        temp.addFirst(3);
        temp.addFirst(2);
        temp.addFirst(1);
        it= temp.iterator();
        it.next();
        it.next();
        System.out.println(temp);
        it.remove();
        System.out.println(temp);

        temp=new DoublyLinkedList<Integer>();
        temp.addFirst(3);
        temp.addFirst(2);
        temp.addFirst(1);
        System.out.println();
        it= temp.iterator();

        it.remove();//must throw an exception
    }
}
