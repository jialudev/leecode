import org.junit.Test;
import java.util.List;

public class TestSolution {
    @Test
    public void test() {
        List<Integer> result = Solution.findAnagrams("abcba", "ab");
        System.out.println(result);
    }

}