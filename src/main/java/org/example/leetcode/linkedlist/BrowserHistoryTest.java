package org.example.leetcode.linkedlist;

import java.util.Stack;

public class BrowserHistoryTest {
}

class BrowserHistory {
    Stack<String> back = new Stack<>();
    String current;
    Stack<String> forward = new Stack<>();


    public BrowserHistory(String homepage) {
        current = homepage;

    }

    public void visit(String url) {
        back.push(current);
        current = url;
        forward.clear();
    }

    public String back(int steps) {
        if (back.size() < steps) {
            steps = back.size();
        }
        while (steps != 0) {
            forward.push(current);
            current = back.pop();
            steps--;
        }
        return current;
    }

    public String forward(int steps) {
        if (forward.size() < steps) {
            steps = forward.size();
        }
        while (steps != 0) {
            back.push(current);
            current = forward.pop();
            steps--;
        }
        return current;
    }
}

class DoublyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> prev;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }

    private int size = 0;
    private Node<E> header;
    private Node<E> trailer;

    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty())
            return null;
        return header.getNext().element;
    }

    public E last() {
        if (isEmpty())
            return null;
        return trailer.getPrev().element;
    }

    public void addFirst(E element) {
        addBetween(element, header, header.getNext());
    }

    public void addLast(E element) {
        addBetween(element, trailer.getPrev(), trailer);
    }

    private void addBetween(E element, Node<E> predecessor, Node<E> successor) {
        Node<E> newNode = new Node<>(element, successor, predecessor);
        predecessor.setNext(newNode);
        successor.setPrev(newNode);
        size++;
    }

    public E removeFirst() {
        if (isEmpty())
            return null;
        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty())
            return null;
        return remove(trailer.getPrev());
    }

    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }

    public int getSize() {
        return size;
    }
}

