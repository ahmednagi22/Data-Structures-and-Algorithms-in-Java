import Algorithms.Search;
import Algorithms.Sort;

public class Main {
    public static void main(String[] args) {
        int [] array = {4,3,7,6,8,9,2,1,1};
        Sort.insertionSort(array);
        for(int i :array){
            System.out.print(i+" ");
        }



    }
}