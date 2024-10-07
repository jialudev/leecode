import org.junit.Test;

import java.util.List;

public class TestSolution {
    @Test
    public void test() {
        List<List<Integer>> result = Solution.trap(new int[]{1, -1, -2, -3, 4, 5, 6});
        System.out.println(result);
    }

}