package com.bridgelabz;

public class MyLinkedList<K,V> {
    MyNode<K,V> head;
    MyNode<K,V> tail;


    public void push(K key,V value) {
        MyNode<K,V> newNode = new MyNode(key,value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        MyNode<K,V> temp = head;
        while (temp != null) {
            System.out.print(temp.key + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }


    public void append(K key,V value) {
        MyNode<K,V> newNode = new MyNode(key,value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public MyNode<K,V> pop() {
        if(head == null)
            return null;
        MyNode<K,V> popData = head;
        head = head.next;
        return popData;
    }

    public MyNode<K,V> popLast() {
        if(head == null)
            return null;
        MyNode<K,V> popElement = tail;
        MyNode<K,V> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popElement;
    }

    public MyNode<K,V> search(K searchData) {
        MyNode<K,V> temp = head;
        if(head == null)
            return null;
        while (temp != null) {
            if (temp.key.equals(searchData))
                return temp;
            temp =  temp.next;
        }
        return null;
    }

    public boolean searchAndInsert(K searchData, K insertData, V frequency) {
        MyNode<K,V> newMyNode = new MyNode<>(insertData,frequency);
        MyNode<K,V> searchedMyNode = search(searchData);
        if (searchedMyNode == null)
            return false;
        else {
            newMyNode.next = searchedMyNode.next;
            searchedMyNode.next = newMyNode;
            return true;
        }
    }

    @Override
    public String toString() {
        return " \n{" + head + "}";
    }
}
