package design_patterns.strategy_pattern;

import java.util.Arrays;

public class QuickSortStrategy implements SortingStrategy{
    public void sort(int[] arr) {
        Arrays.sort(arr);
        System.out.println("sorted using quick sort");
    }
}
