package design_patterns.strategy_pattern;

import java.util.Arrays;

public class MergeSortStrategy implements SortingStrategy{
    public void sort(int[] arr) {
        Arrays.sort(arr);
        System.out.println("sorted using merge sort");
    }
}
