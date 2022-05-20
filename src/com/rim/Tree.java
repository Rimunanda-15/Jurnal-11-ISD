package com.rim;

public class Tree <E extends Comparable<E>> {
    private  Node<E> root;
    public Tree() {
        root = null;
    }

    public void insertNode(E insertvalue){
        if (root == null){
            root = new Node<>(insertvalue);
            System.out.println(insertvalue+" adalah root");
        }else {
            root.insert(insertvalue);
        }
    }

    public void search(E key){
        boolean result = searchHelper(root, key);

        if (result){
            System.out.println("Node " + key + " ditemukan");
        }else {
            System.out.println("node " + key + " tidak ada ");
        }
    }

    public boolean searchHelper(Node<E> node, E key){
        boolean result = false;

        if (node != null){
            if (key.equals(node.getHuruf())){
                result = true;
            } else if (key.compareTo(node.getHuruf())<0) {
                result=searchHelper(node.getleft(), key);
            } else if (key.compareTo(node.getHuruf())>0){
                result=searchHelper(node.getRight(), key);
            }
        }
        return  result;
    }
}
