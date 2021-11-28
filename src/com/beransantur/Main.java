package com.beransantur;

public class Main {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.insertToTail(15);
        myLinkedList.insertToTail(25);
        myLinkedList.insertToTail(35);
        myLinkedList.insertToTail(45);
        myLinkedList.insertToTail(55);
        myLinkedList.swapElements(25, 55);
        myLinkedList.print();
        System.out.println();
        myLinkedList.insertToTail(85);
        myLinkedList.print();
        System.out.println();
        myLinkedList.sort();
        myLinkedList.print();

    }
}
