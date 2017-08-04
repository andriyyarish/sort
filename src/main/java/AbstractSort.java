import java.util.Arrays;

/**
 * Created by andy on 8/3/2017.
 */
public abstract class AbstractSort {
    protected int[] randomArr;

    public abstract int [] sort();

    protected void printArray(int[] arr){
        System.out.println("------->>>");
        Arrays.stream(arr).forEach(s -> System.out.print(s + ","));
        System.out.println();
    }


}
