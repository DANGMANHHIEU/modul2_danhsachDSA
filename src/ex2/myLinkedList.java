package ex2;

import javax.xml.soap.Node;

public class myLinkedList {
    private Node head;
    private int numNode;

    public myLinkedList(Object data) {
        head = new Node(data);
        numNode++;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
public void add(int index,Object data){
        Node temp = head;
        Node holder;
        for (int i = 0;i<index-1 &&temp.next!=null;i++){

        }
}
}
