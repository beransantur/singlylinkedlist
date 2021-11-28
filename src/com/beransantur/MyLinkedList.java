package com.beransantur;

public class MyLinkedList {
    Node head;
    Node tail;
    private int size;

    public void insertHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;

        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertToTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int getSize(){
        return size;
    }

    public void removeHead() {
        if (head == null) {
            return;
        }

        Node temp = head.next;
        head.next = null;
        head = temp;
        size--;
    }

    public void removeFromTail() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            if (current.next == tail) {
                current.next = null;
                tail = current;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(int data) {
        int index = 0;
        Node current = head;

        while (current != null) {

            if (current.data == data) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public int get(int index) {
        int i = 0;
        Node current = head;
        while (current != null) {
            if (indexOf(current.data) == index) {
                return current.data;
            }
            current = current.next;
        }
        return -1;
    }

    public void swapElements(int first, int second) {
        Node firstNode = head;
        Node firstNodePrev = null;
        while (firstNode != null) {
            if (firstNode.data == first) {
                break;
            }
            firstNodePrev = firstNode;
            firstNode = firstNode.next;
        }

        Node secondNode = head;
        Node secondNodePrev = null;
        while (secondNode != null) {
            if (secondNode.data == second) {
                break;
            }
            secondNodePrev = secondNode;
            secondNode = secondNode.next;
        }

        if (firstNode == null || secondNode == null) {
            return;
        }
        if (firstNodePrev != null) {
            firstNodePrev.next = secondNode;
        } else {
            head = secondNode;
        }

        if (secondNodePrev != null) {
            secondNodePrev.next = firstNode;
        } else {
            head = firstNode;
        }
        if (firstNode.next == null) {
            tail = secondNode;
        }

        if (secondNode.next == null) {
            tail = firstNode;
        }

        Node temp = firstNode.next;
        firstNode.next = secondNode.next;
        secondNode.next = temp;


    }

    public void reverseLinkedList() {
        Node current = head;
        Node previous = null;
        Node next = null;
        tail = head;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void sort() {
        Node current = head;
        Node index = null;

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.data > index.data) {
                    int temp = current.data;
                    ;
                    current.data = index.data;
                    ;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

}
