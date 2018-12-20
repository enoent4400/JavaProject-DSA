//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

class Node {
    protected long data;
    protected Node next;
    protected Node prev;

    public Node() {
        this.next = null;
        this.prev = null;
        this.data = 0L;
    }

    public Node(long d, Node n, Node p) {
        this.data = d;
        this.next = n;
        this.prev = p;
    }

    public void setLinkNext(Node n) {
        this.next = n;
    }

    public void setLinkPrev(Node p) {
        this.prev = p;
    }

    public Node getLinkNext() {
        return this.next;
    }

    public Node getLinkPrev() {
        return this.prev;
    }

    public long getData() {
        return this.data;
    }
}
