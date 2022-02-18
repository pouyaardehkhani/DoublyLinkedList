# DoublyLinkedList ![license](https://img.shields.io/github/license/pouyaardehkhani/DoublyLinkedList.svg)
Implementation of Doubly LinkedList using java.

Consider the **DoublyLinkedList<E>** two-way linkedlist class, which has two Node<E> **head** and **tail** references at the beginning and end of the list. Each node has **data attributes of type E** and two Node<E> references named **prev** and **next** to refer to before and after nodes.

# Methods:
* boolean addFirst (E element): Add the element in the input parameter to the beginning of the list
* boolean addLast (E element): Add the element in the input parameter to the bottom of the list
* boolean add (int index, E element): The element in the input parameter in the index position to Add list
* E removeFirst () removes the top node of the list and returns the data
* E removeLast () removes the node at the bottom of the list and returns the data
* E remove (int index) to remove ninety index positions from the list
* int size () Returns the number of elements in the list
* String toString () Displays the data of each node in the list from beginning to end
* boolean addNonRedundant () will add an element to the head list only if that element is already in the list Not available, he adds. If the list is empty, this element will be the only element in the list. If the list changes, output the method is true and if the list does not change, the output of the method is false.
