package design_patterns.strategy_pattern;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{7,2,1,6,3,8,6,5};

        SortingContext sc = new SortingContext(new BubbleSortStrategy());
        sc.performSorting(arr);

        sc.setSortingStrategy(new MergeSortStrategy());
        sc.performSorting(arr);
    }
}
