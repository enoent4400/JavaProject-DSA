//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

class LinkedList {
    protected Node start = null;
    protected Node end = null;
    public long size = 0L;

    public LinkedList() {
    }

    public boolean isEmpty() {
        return this.start == null;
    }

    public long getSize() {
        return this.size;
    }

    public void insertAtStart(int val) {
        Node newPointer = new Node((long)val, (Node)null, (Node)null);
        if (this.start == null) {
            this.start = newPointer;
            this.end = this.start;
        } else {
            this.start.setLinkPrev(newPointer);
            newPointer.setLinkNext(this.start);
            this.start = newPointer;
        }

        ++this.size;
    }

    public void insertAtEnd(int val) {
        Node newPointer = new Node((long)val, (Node)null, (Node)null);
        if (this.start == null) {
            this.start = newPointer;
            this.end = this.start;
        } else {
            newPointer.setLinkPrev(this.end);
            this.end.setLinkNext(newPointer);
            this.end = newPointer;
        }

        ++this.size;
    }

    public Node getHead(){
        return this.start;
    }

    public void insertAtPos(int val, int pos) {
        Node newPointer = new Node((long)val, (Node)null, (Node)null);
        if (pos == 1) {
            this.insertAtStart(val);
        } else {
            Node pointer = this.start;

            for(int i = 2; (long)i <= this.size; ++i) {
                if (i == pos) {
                    Node tmp = pointer.getLinkNext();
                    pointer.setLinkNext(newPointer);
                    newPointer.setLinkPrev(pointer);
                    newPointer.setLinkNext(tmp);
                    tmp.setLinkPrev(newPointer);
                }

                pointer = pointer.getLinkNext();
            }

            ++this.size;
        }
    }

    public void deleteAtPos(int pos) {
        if (pos == 1) {
            if (this.size == 1) {
                this.start = null;
                this.end = null;
                this.size = 0L;
            } else {
                this.start = this.start.getLinkNext();
                this.start.setLinkPrev((Node)null);
                --this.size;
            }
        } else {
            if ((long)pos == this.size) {
                this.end = this.end.getLinkPrev();
                this.end.setLinkNext((Node)null);
                --this.size;
            }

            Node pointer = this.start.getLinkNext();

            for(int i = 2; (long)i <= this.size; ++i) {
                if (i == pos) {
                    Node p = pointer.getLinkPrev();
                    Node n = pointer.getLinkNext();
                    p.setLinkNext(n);
                    n.setLinkPrev(p);
                    --this.size;
                    return;
                }

                pointer = pointer.getLinkNext();
            }

        }
    }

    public long getIndexValue(long index) {
        Node current = this.start;

        for(int count = 1; current != null; current = current.getLinkNext()) {
            if ((long)count == index) {
                return current.getData();
            }

            ++count;
        }

        return 0L;
    }

    public int getDataIndex(int data) {
        Node current = this.start;

        for(int count = 1; current != null; current = current.getLinkNext()) {
            if (current.getData() == (long)data) {
                return count;
            }

            ++count;
        }

        return -1;
    }

    public void display() {
        System.out.print("\nDoubly Linked List = ");
        if (this.size == 0L) {
            System.out.print("empty\n");
        } else if (this.start.getLinkNext() == null) {
            System.out.println(this.start.getData());
        } else {
            Node pointer = this.start;
            System.out.print(this.start.getData() + " <-> ");

            for(pointer = this.start.getLinkNext(); pointer.getLinkNext() != null; pointer = pointer.getLinkNext()) {
                System.out.print(pointer.getData() + " <-> ");
            }

            System.out.print(pointer.getData() + "\n");
        }
    }

    Node sortedMerge(Node a, Node b)
    {
        Node result = null;

        if (a == null)
            return b;
        if (b == null)
            return a;

        if (a.data <= b.data)
        {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else
        {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;

    }

    Node mergeSort(Node h)
    {

        if (h == null || h.next == null)
        {
            return h;
        }

        Node middle = getMiddle(h);
        Node nextOfMiddle = middle.next;


        middle.next = null;


        Node left = mergeSort(h);

        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);

    }

    Node getMiddle(Node n) {

        if (n == null) return n;
        Node firstptr = n.next;
        Node secondptr = n;

        while (firstptr != null)
        {
            firstptr = firstptr.next;
            if(firstptr!=null)
            {
                secondptr = secondptr.next;
                firstptr = firstptr.next;
            }
        }
        return secondptr;
    }

    public void printList(Node headref)
    {
        System.out.println("Sorted list: ");
        while (headref != null)
        {

            System.out.print(headref.getData() + " ");
            headref = headref.next;

        }

    }
}
