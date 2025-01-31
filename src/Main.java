import Algorithms.Search;
import Algorithms.Sort;
import DataStructures.BinarySearchTree;
import DataStructures.MyQueue;
import DataStructures.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));
        tree.display();
        tree.remove(8);
        System.out.println("-------------------");
        tree.display();
    }
}