import org.junit.Test;

import java.util.Arrays;

public class TestSolution {
    @Test
    public void test() {
        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Solution.rotate(ints);
        System.out.println(Arrays.deepToString(ints));
    }

}