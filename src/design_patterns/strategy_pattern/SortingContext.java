package design_patterns.strategy_pattern;

public class SortingContext {
    private SortingStrategy s;
    public SortingContext(SortingStrategy s) {
        this.s = s;
    }

    public void setSortingStrategy(SortingStrategy newS) {
        this.s = newS;
    }

    public void performSorting(int[] arr) {
        this.s.sort(arr);
    }
}
