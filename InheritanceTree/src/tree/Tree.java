/*
    Author: Enes ALAN

    Date : 08.05.2017

    Number :013356

    Tree structure by using Json Files


 */


package tree;

import java.util.*;

// You may add new methods and fields to this class
// as long as you do not change the signature of the given methods.
public class Tree {
    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public Node lowestCommonParent(Node node1, Node node2) {
        boolean testValue;
        while (testValue = true) {
            Node node1sParent = node1.getParent();
            if (node1 == node1sParent || node1sParent == node1sParent.getParent()) {
                testValue = false;
                int counter = 0;
                counter++;
            }

        }
        if (node1.getChildren().size() < node2.getChildren().size()) {
            return node1;
        } else {
            return node2;
        }
    }
}
