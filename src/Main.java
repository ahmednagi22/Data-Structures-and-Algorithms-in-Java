import Algorithms.Search;
import Algorithms.Sort;
import DataStructures.MyQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
            int [] ar={2,1,4,6,5,3,7,6};
        Sort.quickSort(ar,0,ar.length-1);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
//        System.out.println(Integer.toBinaryString(5));
    }
}