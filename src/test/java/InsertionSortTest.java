import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Andriy_Yarish on 8/2/2017.
 */
public class InsertionSortTest {
    InsertionSort insertionSort;

    @Test
    public void containsAllAndSize(){
        insertionSort = new InsertionSort();
        int [] arrInitial = insertionSort.getRandomArr();
        insertionSort.sort();
        int [] arrSorted = insertionSort.getRandomArr();
        Assert.assertTrue(Arrays.asList(arrInitial).containsAll(Arrays.asList(arrSorted)));
        Assert.assertEquals(arrInitial.length, arrSorted.length);
    }

    @Test
    public void naturalOrder(){
        insertionSort = new InsertionSort();
        insertionSort.sort();
        int [] arrResult = insertionSort.getRandomArr();
        for (int i = 0; i<arrResult.length-2; i++)
            assertTrue("left: " + arrResult[i] + " right: " + arrResult[i+1], arrResult[i] <= arrResult[i+1]);
    }
}
