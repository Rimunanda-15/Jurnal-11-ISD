package com.rim;

public class Main {
    public static void main(String[] args) {
        Tree<String> bts = new Tree<>();

        bts.insertNode("F");
        bts.insertNode("E");
        bts.insertNode("H");
        bts.insertNode("D");
        bts.insertNode("G");
        bts.insertNode("C");
        bts.insertNode("B");
        bts.insertNode("H");
        bts.insertNode("K");
        bts.insertNode("J");

        bts.search("K");
        bts.search("A");
    }
}
