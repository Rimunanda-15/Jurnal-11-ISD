package com.rim;

public class Node<E extends Comparable<E>> {
    private final E huruf;
    private Node<E>left;
    private Node<E>right;

    public Node(E element) {
        huruf = element;
        left=right=null;
    }

    public E getHuruf() {
        return huruf;
    }

    public Node<E> getleft(){
        return left;
    }

    public Node<E> getRight(){
        return right;
    }

    public void insert(E value){
        if (value.compareTo(huruf)<0){
            if (left == null){
                left= new Node<>(value);
                System.out.println(value+ " data dimasukan ke left child dari "+ huruf);
            }else {
                left.insert(value);
            }

        }else if (value.compareTo(huruf)>0){
            if (right == null){
                right = new Node<>(value);
                System.out.println(value + " data dimasukan right child dari " + huruf);
            }else {
                right.insert(value);
            }
        }
    }
}






