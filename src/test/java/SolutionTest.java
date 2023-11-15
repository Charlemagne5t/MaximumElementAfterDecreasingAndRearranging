import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maximumElementAfterDecrementingAndRearrangingTest1() {
        int[] arr = {2, 2, 1, 2, 1};
        int expected = 2;
        int actual = new Solution().maximumElementAfterDecrementingAndRearranging(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maximumElementAfterDecrementingAndRearrangingTest2() {
        int[] arr = {100, 1, 1000};
        int expected = 3;
        int actual = new Solution().maximumElementAfterDecrementingAndRearranging(arr);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maximumElementAfterDecrementingAndRearrangingTest3() {
        int[] arr = {1, 2, 3, 4, 5};
        int expected = 5;
        int actual = new Solution().maximumElementAfterDecrementingAndRearranging(arr);

        Assert.assertEquals(expected, actual);
    }
}
