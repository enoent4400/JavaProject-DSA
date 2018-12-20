//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class DoublyLinkedList {
    public DoublyLinkedList() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Doubly Linked List Test\n");

        char ch;
        do {
            System.out.println("\nDoubly Linked List Operations\n");
            System.out.println("1. insert at beginning");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check if list is empty");
            System.out.println("6. check if exists at position");
            System.out.println("7. get size");
            System.out.println("8. get index of element");
            System.out.println("9. sort linked list");
            int choice = scan.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter integer element to insert");
                    list.insertAtStart(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter integer element to insert");
                    list.insertAtEnd(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Enter integer element to insert");
                    int num = scan.nextInt();
                    System.out.println("Enter position");
                    int pos = scan.nextInt();
                    if (pos >= 1 && (long)pos <= list.getSize()) {
                        list.insertAtPos(num, pos);
                        break;
                    }

                    System.out.println("Invalid position\n");
                    break;
                case 4:
                    System.out.println("Enter position");
                    int p = scan.nextInt();
                    if (p >= 1 && (long)p <= list.getSize()) {
                        list.deleteAtPos(p);
                        break;
                    }

                    System.out.println("Invalid position\n");
                    break;
                case 5:
                    System.out.println("Empty status = " + list.isEmpty());
                    break;
                case 6:
                    System.out.println("Enter index position to search for an element: \n");
                    long index = (long)scan.nextInt();
                    if (list.getIndexValue(index) == 0L) {
                        System.out.println("Element at this index position does not exist.\n");
                    } else {
                        System.out.println("Element at this index position  has a value " + list.getIndexValue(index));
                    }
                    break;
                case 7:
                    System.out.println("Size = " + list.getSize() + " \n");
                    break;
                case 8:
                    System.out.println("Enter value to search in a list:");
                    int val = scan.nextInt();
                    if (list.getDataIndex(val) == -1) {
                        System.out.println("Element you searched for does not exist.");
                    } else {
                        System.out.println("Element is at index position: " + list.getDataIndex(val) + " \n");
                    }
                    break;
                case 9:
                    LinkedList unsortedList = list;
                    Node headElement = list.getHead();
                    headElement = unsortedList.mergeSort(headElement);
                    list.printList(headElement);
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
            }

            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while(ch == 'Y' || ch == 'y');

    }
}
