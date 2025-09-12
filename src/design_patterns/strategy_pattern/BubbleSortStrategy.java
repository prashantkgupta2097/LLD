package design_patterns.strategy_pattern;

import java.util.Arrays;

public class BubbleSortStrategy implements SortingStrategy{
    public void sort(int[] arr) {
        Arrays.sort(arr);
        System.out.println("sorted using bubble sort");
    }
}
