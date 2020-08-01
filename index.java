class DoublyLinedLst {
    Node head, tail;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addNode(int data) {

        Node new_node = new Node(data);

        if (head == null) {
            head = tail = new_node;
            tail.prev = null;
            tail.next = null;
        } else {

            Node current = head;
            while (current.next != null) {
                current.next = current;
            }
            current.next = new_node;
            new_node.prev = current;
            new_node.next = null;
        }
    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("The Linked List id empty .....");
        } else {
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinedLst dL = new DoublyLinedLst();
        dL.addNode(12);
        dL.addNode(10);
        dL.addNode(11);
        dL.addNode(13);
        dL.addNode(14);
        dL.addNode(15);
        dL.addNode(16);
        dL.addNode(17);

        dL.display();
    }
}